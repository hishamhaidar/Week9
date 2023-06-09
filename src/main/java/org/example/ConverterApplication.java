package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ConverterApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/converter.fxml"));
        stage.setTitle("Number Converter");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
