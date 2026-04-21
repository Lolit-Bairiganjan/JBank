package com.brainware.jbanking;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        
        Scene scene = new Scene(StageManager.showLogin());
        stage.setScene(scene);
        stage.setTitle("JBank Application");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}