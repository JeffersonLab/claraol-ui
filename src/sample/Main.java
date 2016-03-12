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

        // Extract design from FXMl file service.fxml
        Parent root = FXMLLoader.load(getClass().getResource("win.fxml"));

        // Designate design and initial consitions for the primary stage.
        primaryStage.setTitle("Clara");
        primaryStage.setScene(new Scene(root, 700, 300, Color.TRANSPARENT));
        primaryStage.initStyle(StageStyle.TRANSPARENT);

        // Designate the positioning of the stage.
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
        double x = ((0.95) * primaryScreenBounds.getWidth()), y = (0.93) * primaryScreenBounds.getHeight();
        primaryStage.setX(primaryScreenBounds.getMinX() + primaryScreenBounds.getWidth() - x);
        primaryStage.setY(primaryScreenBounds.getMinY() + primaryScreenBounds.getHeight() - y);

        // Make the stage visible
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
