package amn.inventory.desktop.model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableBooleanValue;
import javafx.fxml.FXML;

import java.util.ArrayList;
import java.util.List;

public class RowData {
    private List<String> rowData;

    private BooleanProperty generated;

//
//    public RowData() {
//        this.rowData = new ArrayList<>();
//        this.isGenerate = false;
//    }

    public RowData(String[] data) {
        this.rowData = new ArrayList<>();
        this.generated = new SimpleBooleanProperty(false);
        for (String el : data) {
            this.rowData.add(el);
        }
    }

    public int size() {
        if (this.rowData == null) return -1;
        return this.rowData.size();
    }

    public StringProperty getCellValue(int indx) {
        return new SimpleStringProperty(this.rowData.get(indx));
    }

    public void setCellValue(int indx, String value) {
        this.rowData.set(indx, value);
    }

    public ObservableBooleanValue isGenerated() {
        return this.generated;
    }



//    public void setGenerated(boolean value) {
//        this.generated.setValue(value);
//    }

    ////////

//    public BooleanProperty generatedProperty() {
//        return generated;
//    }

//    public void setGenerated(Boolean generated) {
//        this.generated.setValue(generated);
//    }

//    public Boolean getGenerated() {
//        return generated.getValue();
//    }

}
