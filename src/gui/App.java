package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        StackPane layout = new StackPane();

        primaryStage.setTitle("Clara");
        primaryStage.setScene(new Scene(layout, 700, 510));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
