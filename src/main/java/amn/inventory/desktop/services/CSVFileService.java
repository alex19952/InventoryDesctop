package amn.inventory.desktop.services;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class CSVFileService {
    char separator;
    private ArrayList<String[]> data;

    public CSVFileService(char separator) {
        this.separator = separator;
    }
    public CSVFileService() {
        this.separator = ';';
    }

    public ArrayList<String[]> getData(String filePath){
        this.data = new ArrayList<>();
        try (CSVReader reader = new CSVReaderBuilder(new FileReader(filePath))
                .withCSVParser(new CSVParserBuilder().withSeparator(this.separator).build())
                .build()) {
            String[] line;
            while ((line = reader.readNext()) != null) {
                this.data.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
        return this.data;
    }

}
