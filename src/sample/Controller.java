package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;;
import gui.service.Main;
import javafx.stage.Stage;

public class Controller implements Initializable {

    @FXML
    private Button close_button,
                   Open_services; // value will be injected by the FXMLLoader

    @Override // This method is called by the FXMLLoader when initialization is complete
    public void initialize (URL fxmlFileLocation, ResourceBundle resources) {
        assert close_button != null : "fx:id=\"close_button\" was not injected: check your FXML file 'service.fxml'." ;
        assert Open_services != null: "fx:id=\"Open_services\" was not injected: check your FXML file 'service.fxml'.";

        close_button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });

        Open_services.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Parent root;
                try {
                    root = FXMLLoader.load(getClass().getResource("service.fxml"));
                    Stage stage = Main.Win(root);
                    stage.show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
