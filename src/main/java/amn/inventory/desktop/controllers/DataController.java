package amn.inventory.desktop.controllers;

import amn.inventory.desktop.model.RowData;
import amn.inventory.desktop.model.TableData;
import amn.inventory.desktop.services.CSVFileService;

import java.util.ArrayList;

public class DataController {
    private TableData tableData;

    public DataController() {
        tableData = getTableDataFromCSV("D:\\coding\\Java\\GTNN\\InventoryD\\InventoryDesctop\\test\\Основной_файл — копия3.csv", true);
    }

    public TableData getTableData() {
        return tableData;
    }

    private TableData getTableDataFromCSV(String filePath, boolean withTitle) {
        CSVFileService csvFileService = new CSVFileService();
        tableData = new TableData();
        int indx = 0;
        ArrayList<String[]> data = csvFileService.getData(filePath);
        if (withTitle) {
            tableData.setTitles(data.get(indx));
            indx++;
        }
        for (int i = indx; i < data.size(); i++) {
            tableData.add(new RowData(data.get(i)));
        }

        return tableData;
    }

}
