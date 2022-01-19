package com.example.java_proj9_javafx_gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        // launch method is a static method that belongs to the application
        // and since the main class is a child class of the app class it inherit the method
        // and behind, the start method will be called
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try{
            // creating a new stage
            //Stage myStage = new Stage();

            // passing a root node to the constructor
            // this will contain our components
            //Group root = new Group(); // I'll comment this line, because I'll create my group node based on my fxml file

            Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));

            // this is empty because it doesn't have a scene in it
            // changing background color of the scene
            // we can also pass the width and height to the window when creating a scene
            // if you pass width and heigth args to the scene const. The dimensions will not match the size of the sceneBuilder win
            //Scene scene = new Scene(root, 900, 600, Color.SKYBLUE);
            Scene scene = new Scene(root, Color.SKYBLUE);
            // apply the css file to the scene - line below is for just one scene
            //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            // to apply the css file to more than 1 scene
            // the String will contain the location of our css
            //String css = this.getClass().getResource("application.css").toExternalForm();
            //scene.getStylesheets().add(css);
            // now you can just add the next scene with that css
            //scene2.getStylesheets().add(css);
            //scene3.getStylesheets().add(css); // etc

            // adding a text to the scene
            Text text = new Text();
            text.setText("Welcome to the Game!");
            // set text position
            text.setX(150);
            text.setY(200);
            // changing the FONT
            text.setFont(Font.font("Verdana", 50));
            // change text color
            text.setFill(Color.PURPLE);


            // adding a line
            Line line = new Line();
            // where do we want that line to start - set x and y starts
            line.setStartX(150);
            line.setStartY(210);
            // where do we want that line to end - set x and y ends
            line.setEndX(720);
            line.setEndY(210);
            // stroke width
            line.setStrokeWidth(5);
            // stroke color
            line.setStroke(Color.DEEPPINK);
            // change the transparency from 0 to 1
            line.setOpacity(0.5);
            // to rotate the line
            //line.setRotate(45);

            // adding a rectangle
            Rectangle rectangle = new Rectangle();
            // rectangle positions, Width and Height
            rectangle.setX(400);
            rectangle.setY(300);
            rectangle.setWidth(100);
            rectangle.setHeight(100);
            // changing color
            rectangle.setFill(Color.BLUE);
            // border
            rectangle.setStrokeWidth(5);
            // border color
            rectangle.setStroke(Color.PURPLE);

            // adding a triangle and then a circle
            Polygon triangle = new Polygon();
            triangle.getPoints().setAll(
                    200.0, 200.0,
                    300.0, 300.0,
                    200.0, 300.0
            );
            triangle.setFill(Color.YELLOW);

            Circle circle = new Circle();
            circle.setCenterX(350);
            circle.setCenterY(350);
            circle.setRadius(50);
            circle.setFill(Color.ORANGE);

            // adding the text to our root node
            //root.getChildren().add(text);

            // add the line to our root node
            //root.getChildren().add(line);

            // add the rectangle to our root node
            //root.getChildren().add(rectangle); // change it to show the rectangle

            // add the triangle to the root node
            //root.getChildren().add(triangle); // change it to show the triangle

            // add the circle to the root node
            //root.getChildren().add(circle); // change it to show the circle

            // set an icon the my stage
            //Image icon = new Image("dice.png");
            //primaryStage.getIcons().add(icon);

            // title to the stage
            primaryStage.setTitle("Name of the Program");

            // set width and height
            //primaryStage.setWidth(600);
            //primaryStage.setHeight(600);
            // but it will be still resizable. You can decide it to not be resizable
            primaryStage.setResizable(false);

            // set the x and y position where the window will appears in our pc
            // normally FX will place it in the center of our screen
            //primaryStage.setX(100);
            //primaryStage.setY(100);

            // to the window be fullscreen:
            //primaryStage.setFullScreen(true);
            //primaryStage.setFullScreenExitHint("Press Esc to exit");

            // setting the scene
            primaryStage.setScene(scene);
            // order: Stage > Scene > root

            // but I'll use the primaryStage
            primaryStage.show();

        } catch(Exception e){
            e.printStackTrace();
        }

    }

}
