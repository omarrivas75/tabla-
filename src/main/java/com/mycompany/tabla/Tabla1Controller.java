package com.mycompany.tabla;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;

public class Tabla1Controller implements Initializable {

    @FXML
    private Label lblTabla;


    @FXML
    private TextArea txtResultado;

    @FXML
    private TextField txtTabla1;
    @FXML
    private Button btncalcular;
    @FXML
    private Button btnlimpiar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txtResultado.setEditable(false);
    }

    @FXML
    private void calcularTabla(ActionEvent event) {
        try {

            int numero = Integer.parseInt(txtTabla1.getText().trim());


            StringBuilder tabla = new StringBuilder();

            for (int i = 1; i <= 10; i++) {
                tabla.append(numero)
                     .append(" x ")
                     .append(i)
                     .append(" = ")
                     .append(numero * i)
                     .append("\n");
            }


            txtResultado.setText(tabla.toString());

        } catch (NumberFormatException e) {

            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Dato incorrecto");
            alerta.setHeaderText("Entrada no valida");
            alerta.setContentText(
                "Ingresa un numero entero para calcular la tabla."
            );
            alerta.showAndWait();

            txtTabla1.requestFocus();
        }
    }

    @FXML
    private void Limpiar(ActionEvent event) {
        txtTabla1.clear();
        txtResultado.clear();

        txtTabla1.requestFocus();
    }
}
