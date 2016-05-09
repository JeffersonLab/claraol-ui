package gui.service;

import gui.state.myState;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;

import gui.condition.myCondition;

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

    private ArrayList<myService>    l_Links     = new ArrayList<myService>();
    private ArrayList<myCondition>  l_Condition = new ArrayList<myCondition>();
    private ArrayList<myState>      l_State     = new ArrayList<myState>();

    @FXML
    private TextField           Identity,
                                Service_Config,
                                Engine,
                                Pool_Size,
                                Container,
                                DPE;

    private myService           currService;

    private gui.service.Controller currCtrl         = null;
    private gui.service.Controller toLinkController = null;

    private boolean isLink = false;

    public Controller() {}

    public Controller(gui.service.Controller ctrl, boolean b) {
        this.isLink = b;
        this.toLinkController = ctrl;

        //Status.setText("Service Link");
    }

    public void setIdentity(String aText) {
        this.Identity.setText(aText);
    }

    public void setService(myService aService) {
        this.currService = aService;
    }

    public void updateStates() {
        if( !States.getItems().contains("New State") )
            this.States.getItems().add("New State");

        l_State = (ArrayList<myState>)
                currService.getStates();

        for (int i = 0; i < this.l_State.size(); i++) {
            //System.out.println(l_State.get(i) + " - " + this.States.getItems().contains(l_State.get(i).getName()));
            if(!this.States.getItems().contains(l_State.get(i).getName()))
                this.States.getItems().add(0,
                        l_State.get(i).getName());
        }
    }

    public void updateLinks() {

        if( !Links.getItems().contains("New Link") )
            this.Links.getItems().add("New Link");

        l_Links = (ArrayList<myService>)
                currService.getLinks();

        for (int i = 0; i < this.l_Links.size(); i++) {
            //System.out.println(l_Links.get(i) + " - " + this.Links.getItems().contains(l_Links.get(i).getIdentity().getName()));
            if(!this.Links.getItems().contains(l_Links.get(i).getIdentity().getName()))
                this.Links.getItems().add(0,
                    l_Links.get(i).getIdentity().getName());
        }

    }

    public void updateConditions() {
        if( !Conditions.getItems().contains("New Condition") )
            this.Conditions.getItems().add("New Condition");

        l_Condition = (ArrayList<myCondition>)
                currService.getConditions();

        for (int i = 0; i < this.l_Condition.size(); i++) {
            //System.out.println(l_Condition.get(i) + " - " + this.Conditions.getItems().contains(l_Condition.get(i).getName()));
            if(!this.Conditions.getItems().contains(l_Condition.get(i).getName()))
                this.Conditions.getItems().add(0,
                        l_Condition.get(i).getName());
        }
    }

    public myService getService() {
        return this.currService;
    }

    @Override // This method is called by the FXMLLoader when initialization is complete
    public void initialize (URL fxmlFileLocation, ResourceBundle resources) {
        //assert close_button != null : "fx:id=\"myButton\" was not injected: check your FXML file 'service.fxml'.";
        assert Cancel != null : "fx:id=\"Cancel\" was not injected: check your FXML file service.fxml";
        assert Okay != null : "fx:id=\"Okay\" was not injected: check your FXML file service.fxml";

        currCtrl = this;
        //System.out.println(ctrl);

        // If the service has already been set we load the data.
        //loadData(this.currService);

        // Update all of the comboboxes.
        updateConditions();
        updateLinks();
        updateStates();

        if (this.getService().isNew()) {
            Status.setText("New Service");
        } else {
            Identity.setText(this.getService().getIdentity().getName());
        }

        if(this.getService().isLink()) {
            Status.setText("Link Edit");
        }

        // Handle Identity
        this.Identity.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                    Parent root;
                    try {


                        gui.identity.Controller ctrl =
                                new gui.identity.Controller(currService,
                                        currCtrl);


                        FXMLLoader fxmlLoader = new FXMLLoader(
                                getClass().getResource(
                                        "../identity/identity.fxml"
                                )
                        );

                        fxmlLoader.setController(ctrl);
                        root = fxmlLoader.load();
                        Stage stage = gui.identity.Main.Win(root);

                        stage.show();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

            }
        });

        // Handle Links

        this.Links.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable,
                                String oldValue, String newValue) {
                myService aService = new myService();
                aService.setIsLink(true);

                if(Links.getValue().equals("New Link")) {

                    Parent root = null;
                    try {

                        gui.service.Controller ctrl =
                                new gui.service.Controller(currCtrl, true);


                        ctrl.setService( aService );


                        FXMLLoader fxmlLoader = new FXMLLoader(
                                getClass().getResource(
                                        "service.fxml"
                                )
                        );


                        fxmlLoader.setController(ctrl);
                        root = fxmlLoader.load();
                        Stage stage = Main.Win(root);


                        stage.show();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                } else {

                    String t = Links.getValue();
                    ArrayList<myService> list =
                            (ArrayList<myService>) currService.getLinks();

                    myService serv = null;
                    for(int i = 0; i < l_Links.size(); i++) {
                        System.out.println(l_Links.get(i));
                        if(t.equals(l_Links.get(i).getIdentity().getName())) {

                            serv =
                                    list.get(i);

                            break;

                        }
                    }

                    Parent root = null;
                    try {

                        gui.service.Controller ctrl =
                                new gui.service.Controller();


                        ctrl.setService( serv );
                        //System.out.println(serv);

                        FXMLLoader fxmlLoader = new FXMLLoader(
                                getClass().getResource(
                                        "service.fxml"
                                )
                        );


                        fxmlLoader.setController(ctrl);
                        root = fxmlLoader.load();
                        Stage stage = Main.Win(root);


                        stage.show();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        // Handle Conditions

        this.Conditions.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable,
                                String oldValue, String newValue) {

            }
        });

        // Handle States

        this.States.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable,
                                String oldValue, String newValue) {

            }
        });

        // Handle Engine

        this.Engine.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Engine is Clicked");
            }
        });

        // Handle Configuration

        this.Service_Config.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {



            }
        });

        // Button Listeners below.
        Okay.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // get a handle to the stage
                Stage stage = (Stage) Okay.getScene().getWindow();

                    if( !currService.hasIdentity() ) {

                    } else if(!currService.hasCondition()) {

                    } else if(DPE.getText() != null) {

                    } else if(Pool_Size != null) {

                    } else {
                        if (currService.isLink()) {


                            currService.setContainer(Container.getText());
                            currService.setDpe(DPE.getText());
                            currService.setPoolSize( Integer.parseInt(Pool_Size.getText()) );

                            toLinkController.getService().addLink(currService);
                            toLinkController.updateLinks();




                            currService.setUsed();

                            toLinkController.Links.setValue(
                                    currService.getIdentity().getName()
                            );

                            // do what you have to do
                            stage.close();

                        } else {
                            // Is a regular application service
                            //TODO- Create Controller placeholder for Application
                            // do what you have to do
                            stage.close();
                        }
                    }
            }
        });

        Cancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Closing Services");
                // Deprecated --> alert.getDialogPane().setStyle("-fx-background-color:#282828");
                alert.setHeaderText("Your current work may not be saved");
                alert.setContentText("Are you ok with this?");

                Optional<ButtonType> result = alert.showAndWait();
                if (result.get() == ButtonType.OK){
                    Stage stage = (Stage) Cancel.getScene().getWindow();
                    // do what you have to do
                    stage.close();
                } else {
                    // Used for interop testing purposes.
                }
            }
        });

    }

}
