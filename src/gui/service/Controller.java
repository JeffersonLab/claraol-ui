package gui.service;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button  Cancel,
                    Okay;

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

    private myService           currService;

    public void setService(myService aService) {
        this.currService = aService;
    }

    public myService CurrentService() {
        return this.currService;
    }
    @Override // This method is called by the FXMLLoader when initialization is complete
    public void initialize (URL fxmlFileLocation, ResourceBundle resources) {
        //assert close_button != null : "fx:id=\"myButton\" was not injected: check your FXML file 'service.fxml'.";
        assert Cancel != null : "fx:id=\"Cancel\" was not injected: check your FXML file service.fxml";
        assert Okay != null : "fx:id=\"Okay\" was not injected: check your FXML file service.fxml";

        // If the service has already been set we load the data.
        //loadData(this.currService);

        if (this.CurrentService().isNew()) {
            Status.setText("New Service");
        }

        // Handel Identity
        // Handel Container
        // Handel Links
        // Handel Conditions
        // Handel Engine
        // Handel Configuration
        // Handel States

        

        Okay.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Check all Fields
            }
        });

        Cancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Closing Services");
                alert.setHeaderText("Your current work may not be saved");
                alert.setContentText("Are you ok with this?");

                Optional<ButtonType> result = alert.showAndWait();
                if (result.get() == ButtonType.OK){
                    Stage stage = (Stage) Cancel.getScene().getWindow();
                    // do what you have to do
                    stage.close();
                } else {
                    // Do Nothing ... user chose CANCEL or closed the dialog
                }
            }
        });

    }

}
