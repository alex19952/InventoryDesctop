package amn.inventory.desktop.controllers;

import amn.inventory.desktop.Main;
import amn.inventory.desktop.model.TableData;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        DataController dataController = new DataController();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("table.fxml"));
        fxmlLoader.setController(new TableController(dataController.getTableData()));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Инвентаризация");
        stage.setScene(scene);
        stage.show();

    }

}
