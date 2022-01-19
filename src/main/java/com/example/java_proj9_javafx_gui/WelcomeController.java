package com.example.java_proj9_javafx_gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeController {
    @FXML
    private Label welcomeTitle;
    @FXML
    private Label playerAttributesLabel;
    @FXML
    private Label chooseTownLabel;
    @FXML
    private RadioButton townAspect1;
    @FXML
    private RadioButton townAspect2;
    @FXML
    private RadioButton townAspect3;

    @FXML
    private Button returnMainButton;
    @FXML
    private Button chosenTownButton;

    private Stage Stage;
    private Scene scene;
    private Parent root;

    public void displayPlayerName(String playerName){
        welcomeTitle.setText("Hello " + playerName);
    }

    public void returningToMainScreen(ActionEvent event) throws Exception {
        // fxml loader instance:
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));

        // set the root node
        root = loader.load();

        // add the controller of the main.fxml
        Controller mainController = loader.getController();

        // then take all of that node, and Cast it to a Stage
        Stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        // pass the root node into the scene
        scene = new Scene(root);
        Stage.setScene(scene);
        Stage.show();
    }

    public void nextToStartTheStory(ActionEvent event) throws Exception{
        // fxml that I want to load next:
        FXMLLoader loader = new FXMLLoader(getClass().getResource("StoryStartScene.fxml"));

        // set the root node
        root = loader.load();

        // add the controller of the main.fxml
        StoryStartController storyStartController = loader.getController();

        // then take all of that node, and Cast it to a Stage
        Stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        // pass the root node into the scene
        scene = new Scene(root);
        Stage.setScene(scene);
        Stage.show();
    }

}
