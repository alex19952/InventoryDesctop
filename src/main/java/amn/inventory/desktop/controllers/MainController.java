package amn.inventory.desktop.controllers;

import amn.inventory.desktop.Main;
import amn.inventory.desktop.model.TableData;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main_pane.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setMinWidth(400);
        stage.setTitle("Инвентаризация");
        stage.setScene(scene);
        stage.show();
    }

}
