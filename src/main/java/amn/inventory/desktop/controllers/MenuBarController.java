package amn.inventory.desktop.controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;

public class MenuBarController {

    @FXML
    MenuItem menuItemOpen;

    @FXML
    public void initialize() {

        menuItemOpen.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                System.out.println("а тут происходит что то другое");
            }
        });

    }
}
