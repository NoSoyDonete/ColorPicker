package com.example.tarea1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("Selecciona un color:");

        // Crear ColorPicker
        ColorPicker colorPicker = new ColorPicker();
        colorPicker.setValue(Color.BLUE); // valor inicial

        // Evento: cambio de color
        colorPicker.setOnAction(e -> {
            Color color = colorPicker.getValue();
            label.setText("Color seleccionado: " + color.toString());
            label.setTextFill(color); // cambia el color del texto
        });

        VBox vbox = new VBox(10, label, colorPicker);
        Scene scene = new Scene(vbox, 300, 200);

        stage.setTitle("Ejemplo ColorPicker");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
