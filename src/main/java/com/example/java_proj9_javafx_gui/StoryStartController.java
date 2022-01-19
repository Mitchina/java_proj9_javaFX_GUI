package com.example.java_proj9_javafx_gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class StoryStartController {
    @FXML
    private Label attackLabel;
    @FXML
    private Label kingLabel;
    @FXML
    private Label askingWhatToDoLabel;

    @FXML
    private Button escapeButton;
    @FXML
    private Button takeMissionButton;

    @FXML
    private AnchorPane scenePane;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void escapedScene(ActionEvent event) throws IOException {
        // init the stage
        // adding a Cast of Stage
        // our stage is the current stage that we are working it
        //stage = (Stage) scenePane.getScene().getWindow();
        //System.out.println("You successfully escaped!");
        //stage.close();


        // fxml that I want to load next:
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EscapedScene.fxml"));

        // set the root node
        root = loader.load();

        // add the controller of the main.fxml
        EscapedController escapedController = loader.getController();

        // then take all of that node, and Cast it to a Stage
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        // pass the root node into the scene
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void  takeUpTheMissionEnterCathedral(){

    }
}
