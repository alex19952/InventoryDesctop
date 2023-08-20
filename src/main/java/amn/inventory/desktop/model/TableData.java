package amn.inventory.desktop.model;

import java.util.ArrayList;

public class TableData<RowData extends amn.inventory.desktop.model.RowData> extends ArrayList<RowData> {

    private String[] titles;
    private int totalColumns;

    public TableData() {
        super();
        this.totalColumns = 0;
    }

    public TableData(String[] titles) {
        super();
        this.titles = titles;
        this.totalColumns = 0;
    }

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public RowData get(int indx) {
        return super.get(indx);
    }

    @Override
    public boolean add (RowData element){
        if (this.totalColumns == 0) {
            this.totalColumns = element.size();
        }
        if (this.totalColumns != element.size()) {
            // fixme записать в лог, что строка не может быть добавлена, т.к. разный размер строки и таблицы
            // fixme указать в логе тотал колумнс и размер строки
            // обработать в интерфесе ошибки!
            throw new IndexOutOfBoundsException("The size of line (" + String.valueOf(element.size())
                    + ") is not equal to the expected (" + String.valueOf(totalColumns) + ")");
        }
        return super.add(element);
    }

    public String getTitle(int indx) {
        if (indx >= 0) {
            if (indx < this.titles.length) {
                return this.titles[indx];
            }
        }
        return null;
    }

    public void setTitles(String[] titles) {
        this.titles = titles;
    }

    public int getTotalColumns() {
        return this.totalColumns;
    }


}
