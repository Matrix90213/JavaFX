package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainHolaMundo extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root= FXMLLoader.load(getClass().getResource ("hola-mundo.fxml"));
        primaryStage.setTitle("Hola Mundo");
        primaryStage.setScene(new Scene(root,320,240));
        primaryStage.show();
    }
}
