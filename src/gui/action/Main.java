package gui.action;

import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main {

    public static Stage Win(Parent root) throws Exception {

        // Initialize Stage
        Stage primaryStage = new Stage();

        // Designate design and initial consitions for the primary stage.
        primaryStage.setTitle("myAction");
        primaryStage.setScene(new Scene(root, 350, 349, Color.TRANSPARENT));
        primaryStage.initStyle(StageStyle.TRANSPARENT);

        // Designate the positioning of the stage. TODO: Modify
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
        double x = (((0.95) * primaryScreenBounds.getWidth())-700), y = ((0.93) * primaryScreenBounds.getHeight()-350);
        primaryStage.setX(primaryScreenBounds.getMinX() + primaryScreenBounds.getWidth() - x);
        primaryStage.setY(primaryScreenBounds.getMinY() + primaryScreenBounds.getHeight() - y);

        return primaryStage;
    }
}
