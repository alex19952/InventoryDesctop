module amn.invetory.desktop {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.opencsv;



    opens amn.inventory.desktop to javafx.fxml;
    exports amn.inventory.desktop;
    opens amn.inventory.desktop.controllers to javafx.fxml;
}