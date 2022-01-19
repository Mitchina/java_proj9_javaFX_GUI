package com.example.java_proj9_javafx_gui;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class EscapedController {

    @FXML
    private Label escapedLabel;

    @FXML
    private Button exitGameButton;

    @FXML
    private AnchorPane escapedPanel;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void exitGame(){
        // init the stage
        // adding a Cast of Stage
        // our stage is the current stage that we are working it
        stage = (Stage) escapedPanel.getScene().getWindow();
        System.out.println("You successfully escaped!");
        stage.close();
    }
}
