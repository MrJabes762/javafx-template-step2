package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.model.Autor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class CadAutorController {

    @FXML
    private TextField txCPF;

    @FXML
    private TextField txEmail;

    @FXML
    private TextField txNome;

    @FXML
    private void salvarAutor(ActionEvent event) {
        Autor novoAutor = new Autor(txNome.getText(),
                    txEmail.getText(), 
                    txCPF.getText());
        new Alert(AlertType.INFORMATION, 
        "Cadastrando Autor:"+novoAutor.toString()).showAndWait();
    }

}
