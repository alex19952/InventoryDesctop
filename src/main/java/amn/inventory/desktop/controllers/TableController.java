package amn.inventory.desktop.controllers;

import amn.inventory.desktop.model.RowData;
import amn.inventory.desktop.model.TableData;
import amn.inventory.desktop.view.FilteredTableColumn;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.Callback;


import java.util.ArrayList;
import java.util.List;

public class TableController {
    @FXML
    TableView<RowData> tableView;
    TableData<RowData> tableData;

    public TableController(TableData<RowData> tableData) {
        this.tableData = tableData;
    }

    public TableController() {
        DataController dataController = new DataController();
        this.tableData = dataController.getTableData();
    }

    @FXML
    public void initialize() {
        this.tableView.setItems(FXCollections.observableList(this.tableData));
        this.tableView.setEditable(true);
        ArrayList tableColumns = new ArrayList<>();
        EventHandler tableColumnEventHandler = new EventHandler<TableColumn.CellEditEvent<RowData, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<RowData, String> event) {
                event.getRowValue().setCellValue(
                        event.getTablePosition().getColumn(),
                        event.getNewValue());
            }
        };
        for (int i = 0; i < tableData.getTotalColumns(); i++) {
            FilteredTableColumn<RowData, String> tableColumn = new FilteredTableColumn<>(tableData.getTitle(i));
            int finalI = i;
            tableColumn.setCellFactory(TextFieldTableCell.<RowData>forTableColumn());
            tableColumn.setCellValueFactory(param -> param.getValue().getCellValue(finalI));
            tableColumn.setOnEditCommit(tableColumnEventHandler);
            tableColumns.add(tableColumn);
        }
        tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

//        EventHandler tableColumnIsGenerateEventHandler = new EventHandler<TableColumn.CellEditEvent<RowData, Boolean>>() {
//            @Override
//            public void handle(TableColumn.CellEditEvent<RowData, Boolean> event) {
//                System.out.println("че то кликнуло");
//            }
//        };
        FilteredTableColumn<RowData, Boolean> tableColumnIsGenerate = new FilteredTableColumn<>("печатать?");
        tableColumnIsGenerate.setCellValueFactory(param -> param.getValue().isGenerated());
        tableColumnIsGenerate.setCellFactory(param -> new CheckBoxTableCell());
        tableColumns.add(tableColumnIsGenerate);


        tableView.getColumns().setAll(tableColumns);
    }

}
