package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;;

public class Controller implements Initializable {

        @FXML
        private Button close_button; // value will be injected by the FXMLLoader

        @Override // This method is called by the FXMLLoader when initialization is complete
        public void initialize (URL fxmlFileLocation, ResourceBundle resources) {
            assert close_button != null : "fx:id=\"myButton\" was not injected: check your FXML file 'win.fxml'.";

            close_button.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    System.exit(0);
                }
            });
        }

}
