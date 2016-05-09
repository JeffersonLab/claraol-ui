package sample;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import gui.service.myService;
import gui.service.Main;

import javafx.fxml.FXML;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.stage.Stage;


public class Controller extends myApplication implements Initializable {

    private myApplication app = new myApplication();

    @FXML
    private     Button  start,
                        stop,
                        skip,
                        select_service; // value will be injected by the FXMLLoader

    @FXML
    private ComboBox<String> Services_Combo;

    @FXML
    private     TextField   Composition,
                            start_action,
                            stop_action,
                            skip_action;
    private ArrayList<myService> listing = new ArrayList<myService>();

    public void updateComboBox() {
        listing = (ArrayList<myService>) app.getServices();
        for (int i = 0; i < listing.size(); i++) {
            Services_Combo.getItems().add(listing.get(i).getIdentity().getName());
        }
    }

    @Override // This method is called by the FXMLLoader when initialization is complete
    public void initialize (URL fxmlFileLocation, ResourceBundle resources) {
        //assert close_button != null : "fx:id=\"close_button\" was not injected: check your FXML file 'service.fxml'." ;
        //assert Open_services != null: "fx:id=\"Open_services\" was not injected: check your FXML file 'service.fxml'.";
        assert start != null: "fx:id=\"start\" was not injected: check your FXML file 'service.fxml'.";
        assert stop != null: "fx:id=\"stop\" was not injected: check your FXML file 'service.fxml'.";
        assert skip != null: "fx:id=\"skip\" was not injected: check your FXML file 'service.fxml'.";
        assert select_service != null: "fx:id=\"select_service\" was not injected: check your FXML file 'service.fxml'.";

        updateComboBox();

        select_service.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String t = Services_Combo.getValue();

                if (t.equals("New Service")) {

                    Parent root = null;
                    try {

                        gui.service.Controller ctrl =
                                new gui.service.Controller();

                        ctrl.setService( new myService( ) );


                        FXMLLoader fxmlLoader = new FXMLLoader(
                                getClass().getResource(
                                        "../gui/service/service.fxml"
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
                    // Use the selected service
                }
            }
        });

        start.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Started the Application");
            }
        });
    }
}
