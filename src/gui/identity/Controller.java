package gui.identity;

import gui.dataSource.myDataSource;
import gui.engine.myEngine;
import gui.orchestrator.myOrchestrator;
import gui.service.myService;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

/**
 * @author dkroell
 * @version 05/02/2016
 * @see gui/backend/Identity.java
 */

public class Controller implements Initializable {

    @FXML
    Button Okay, Cancel;

    @FXML
    TextField Author, Name, Version;

    @FXML
    TextArea Description;

    private myService       currService         = null;
    private myEngine        currEngine          = null;
    private myDataSource    currDataSource      = null;

    private gui.service.Controller serviceCtrl  = null;
    // variable to hold engine controller
    // variable to hold datasource controller

    public Controller(myService aService,
                      gui.service.Controller aCtrl) {

        currEngine = null;
        currDataSource = null;
        this.currService = aService;
        this.serviceCtrl = aCtrl;

    }

    public Controller(myEngine aEngine) {
        currService = null;
        currDataSource = null;
        currEngine = aEngine;
    }

    public Controller(myDataSource aDataSource) {
        currEngine = null;
        currService = null;
        currDataSource = aDataSource;
    }

    public myService getCurrService() {
        return this.currService;
    }

    public myEngine getCurrEngine() {
        return this.currEngine;
    }

    public myDataSource getCurrDataSource() {
        return currDataSource;
    }



    @Override // This method is called by the FXMLLoader when initialization is complete
    public void initialize (URL fxmlFileLocation, ResourceBundle resources) {

        if (currService != null && currService.hasIdentity()) {

            Name.setText(
                    currService.getIdentity().getName()
            );

            Author.setText(
                    currService.getIdentity().getAuthor()
            );

            Version.setText(
                    currService.getIdentity().getVersion()
            );

            Description.setText(
                    currService.getIdentity().getDescription()
            );

        } else if (currDataSource != null && currDataSource.hasHasIdentity()) {
            // load the data
        } else if(currEngine != null && currEngine.hasIdentity()) {
            // load the data
        }

        Okay.setOnAction(event -> {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Null Information Warning");
            alert.setHeaderText("You have missed Entering: ");

            if(Name.getText().equals("")) {

                alert.setContentText("Identity name");
                alert.showAndWait();

            }else
                if(Author.getText().equals("")) {

                    alert.setContentText("Identity Author");
                    alert.showAndWait();

            } else
                if(Version.getText().equals("")) {

                    alert.setContentText("Identity Version");
                    alert.showAndWait();

            } else
                if(Description.getText().equals("")) {

                    alert.setContentText("Identity Description");
                    alert.showAndWait();

            } else {

                String name = Name.getText();
                String author = Author.getText();
                String version = Version.getText();
                String description = Description.getText();

                    // create the new Identity
                myIdentity id = new myIdentity(
                        name,
                        author,
                        version,
                        description
                );

                    // Append to relevant fields
                if (currService != null && serviceCtrl != null) {

                    currService.setIdentity(id);
                    serviceCtrl.setIdentity(Name.getText());

                } else if (currEngine != null) {

                    currEngine.setIdentity(id);

                } else if (currDataSource != null) {

                    currDataSource.setHasIdentity(id);

                }

                    // get a handle to the stage
                    Stage stage = (Stage) Okay.getScene().getWindow();

                    // do what you have to do
                    stage.close();
            }
        });

        Cancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Closing Identity");
                // Deprecated --> alert.getDialogPane().setStyle("-fx-background-color:#282828");
                alert.setHeaderText("Your current work may not be saved");
                alert.setContentText("Are you ok with this?");

                Optional<ButtonType> result = alert.showAndWait();
                if (result.get() == ButtonType.OK){
                    Stage stage = (Stage) Cancel.getScene().getWindow();
                    // do what you have to do
                    stage.close();
                } else {
                    // Do nothing, since cancel is pressed.
                }
            }
        });
    }
}
