package amn.inventory.desktop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main_pane.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setMinWidth(400);
        primaryStage.setTitle("Инвентаризация");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}