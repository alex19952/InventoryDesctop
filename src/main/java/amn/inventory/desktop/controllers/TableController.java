package amn.inventory.desktop.controllers;

import amn.inventory.desktop.model.RowData;
import amn.inventory.desktop.model.TableData;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.ArrayList;

public class TableController {
    @FXML
    private TableView<RowData> tableView;
    private TableData tableData;

    public TableController(TableData tableData) {
        this.tableData = tableData;
    }

    public TableController() {
        DataController dataController = new DataController();
        tableData = dataController.getTableData();
    }

    @FXML
    public void initialize() {
        tableView.setItems(FXCollections.observableList(tableData));
        ArrayList tableColumns = new ArrayList<>();
        for (int i = 0; i < tableData.getTotalColumns(); i++) {
            TableColumn<RowData, String> tableColumn = new TableColumn<>(tableData.getTitle(i));
            int finalI = i;
            tableColumn.setCellValueFactory(cellData -> cellData.getValue().getCell(finalI));
            tableColumns.add(tableColumn);
        }
        tableView.getColumns().setAll(tableColumns);
    }

}
