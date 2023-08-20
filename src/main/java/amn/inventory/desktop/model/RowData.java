package amn.inventory.desktop.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;
import java.util.List;

public class RowData {
    private List<String> rowData;

    public RowData() {
        rowData = new ArrayList<>();
    }

    public RowData(String[] data) {
        rowData = new ArrayList<>();
        for (String el : data) {
            rowData.add(el);
        }
    }

    public int size() {
        if (rowData == null) return -1;
        return rowData.size();
    }

    public StringProperty getCell(int indx) {
        return new SimpleStringProperty(rowData.get(indx));
    }

}
