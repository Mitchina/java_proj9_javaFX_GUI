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
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

// the controller class need to be added to the sceneBuilder
public class Controller {

    // declare the TextField
    @FXML
    private Text askingNameLabel;
    @FXML
    private TextField playerName;
    @FXML
    private Button startButton;

    private Stage Stage;
    private Scene scene;
    private Parent root;


    // when the user presses the start button. add ActionEvent e as parameter
    // then associate each method with its button
    public void startPressed(ActionEvent event) throws IOException {
        String name = playerName.getText();

        // fxml loader instance:
        FXMLLoader loader = new FXMLLoader(getClass().getResource("WelcomePlayer.fxml"));

        // set the root node
        root = loader.load();

        // add the WelcomeController
        WelcomeController welcomeController = loader.getController();
        // display the player name
        welcomeController.displayPlayerName(name);

        //System.out.println("The user pressed Start. Let's begin!");
        //name = playerName.getText();
        //System.out.print(playerName.getText());
        //Parent root = FXMLLoader.load(getClass().getResource("WelcomePlayer.fxml"));
        // get the source of this event and Cast it to a node
        // then take all of that node, and Cast it to a Stage
        Stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        // pass the root node into the scene
        scene = new Scene(root);
        Stage.setScene(scene);
        Stage.show();
    }

    /*

    public void switchToMainScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        // get the source of this event and Cast it to a node
        // then take all of that node, and Cast it to a Stage
        primaryStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        // pass the root node into the scene
        scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }*/

    /*
    public void switchToWelcomePlayerScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("WelcomePlayer.fxml"));
        // get the source of this event and Cast it to a node
        // then take all of that node, and Cast it to a Stage
        primaryStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        // pass the root node into the scene
        scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }*/









}
