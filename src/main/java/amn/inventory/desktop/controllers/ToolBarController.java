package amn.inventory.desktop.controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.BufferedReader;

public class ToolBarController {

    @FXML
    Button makeQRButton;

    @FXML
    public void initialize() {
        makeQRButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                System.out.println("тут происходит магия");
            }
        });
    }
}
