package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HolaUsuario {
    @FXML
    public TextField textField;
    @FXML
    public Label etiqueta;
    @FXML
    public Button button;

    public void botonClick(ActionEvent actionEvent) {
        String name= textField.getText();
        etiqueta.setText("Hola "+name);
    }
}
