package gui.identity;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main {

    public static Stage Win(Parent root) throws Exception {

        // Initialize Stage
        Stage primaryStage = new Stage();

        // Designate design and initial consitions for the primary stage.
        primaryStage.setTitle("Identity");
        primaryStage.setScene(new Scene(root, 341, 275));

        return primaryStage;
    }
}
