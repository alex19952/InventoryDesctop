package amn.inventory.desktop.view;

import amn.inventory.desktop.model.RowData;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.util.Callback;

public class FilteredTableColumn<S,T> extends TableColumn<S,T> {

    Button filterButton;
    TextField filterTextField;
    VBox filterVBox;

    public FilteredTableColumn() {
        this(null);
    }

    public FilteredTableColumn(String title) {
        super(title);
        filterButton = new Button();
        filterButton.setText("f");
        filterTextField = new TextField();
        filterVBox = new VBox();
        filterVBox.getChildren().setAll(filterButton, filterTextField);
//        this.setGraphic(filterVBox);

    }

}
