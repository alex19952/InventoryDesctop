module amn.invetory.desctop {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.opencsv;


    opens amn.inventory.desktop to javafx.fxml;
    exports amn.inventory.desktop.controllers;
    opens amn.inventory.desktop.controllers to javafx.fxml;
}