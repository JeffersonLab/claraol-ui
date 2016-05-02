package gui.service;

import javafx.geometry.Rectangle2D;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.StageStyle;

public class Main {

    public static Stage Win(Parent root) throws Exception {

        // Initialize Stage
        Stage primaryStage = new Stage();

        // Designate design and initial consitions for the primary stage.
        primaryStage.setTitle("Clara");
        primaryStage.setScene(new Scene(root, 600, 331));
        return primaryStage;
    }
}
