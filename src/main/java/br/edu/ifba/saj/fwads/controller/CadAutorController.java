package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.Biblioteca;
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
    Autor novoAutor;
    public CadAutorController() {
        this.novoAutor = null;
    }
    @FXML
    private void salvarAutor() {
        novoAutor = new Autor(txNome.getText(),
                    txEmail.getText(), 
                    txCPF.getText());
        new Alert(AlertType.INFORMATION, 
        "Cadastrando Autor:"+novoAutor.getNome()).showAndWait();
        Biblioteca.listaAutores.add(novoAutor);
        limparTela();
    }
    public Autor pegarAutordaLista (){
        return this.novoAutor;
    }
    @FXML
    private void limparTela() {
        txNome.setText("");
        txEmail.setText("");
        txCPF.setText("");
    }

}
