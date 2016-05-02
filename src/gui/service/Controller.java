package gui.service;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button  Cancel,
                    Okay; // value will be injected by the FXMLLoader

    @FXML
    private Label               Status;

    @FXML
    private ComboBox<String>    Links,
                                Conditions,
                                States;

    @FXML
    private TextField           Identity,
                                Service_Config,
                                Engine,
                                Pool_Size,
                                Container,
                                DPE;

    public static void loadData(myService aService) {
        // Loads the Data already into the fields in the window.
    }

    @Override // This method is called by the FXMLLoader when initialization is complete
    public void initialize (URL fxmlFileLocation, ResourceBundle resources) {
        //assert close_button != null : "fx:id=\"myButton\" was not injected: check your FXML file 'service.fxml'.";
        assert Cancel != null : "fx:id=\"Cancel\" was not injected: check your FXML file service.fxml";
        assert Okay != null : "fx:id=\"Okay\" was not injected: check your FXML file service.fxml";

        Okay.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Check all Fields
            }
        });

        Cancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Cancel Clicked");
            }
        });

    }

}
