package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HolaMundoConBoton {
    @FXML
    private Label etiqueta;
    @FXML
    private Button button;

    public void botonClick(ActionEvent actionEvent) {
        etiqueta.setText("Hola Mundo");
    }
}