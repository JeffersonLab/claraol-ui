package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Screen;
import javafx.geometry.Rectangle2D;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // Extract design from FXMl file win.fxml
        Parent root = FXMLLoader.load(getClass().getResource("win.fxml"));

        // Designate design and initial consitions for the primary stage.
        primaryStage.setTitle("Clara");
        primaryStage.setScene(new Scene(root, 700, 445, Color.TRANSPARENT));
        primaryStage.initStyle(StageStyle.TRANSPARENT);

        // Designate the positioning of the stage.
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
        primaryStage.setX(primaryScreenBounds.getMinX() + primaryScreenBounds.getWidth() - 1400);
        primaryStage.setY(primaryScreenBounds.getMinY() + primaryScreenBounds.getHeight() - 850);

        // Make the stage visible
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
