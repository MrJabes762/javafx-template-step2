package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.model.Autor;
import br.edu.ifba.saj.fwads.model.Livro;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.util.StringConverter;

public class CadLivroController {
    @FXML
    private TextField txTitulo;
    @FXML
    private TextField txSubTitulo;
    @FXML
    private TextField txISBN;
    @FXML
    private ChoiceBox<Autor> slAutor;

    @FXML
    void salvarLivro(ActionEvent event) {
        Livro novoLivro = new Livro(txTitulo.getText(),
                    txSubTitulo.getText(), 
                    txISBN.getText(),
                    slAutor.getSelectionModel().getSelectedItem());
        new Alert(AlertType.INFORMATION, 
        "Cadastrando Livro:"+novoLivro.toString()).showAndWait();
      

    }

    @FXML 
    private void initialize() {
        slAutor.setConverter(new StringConverter<Autor>() {
            @Override
            public String toString(Autor obj) {
                if (obj != null) {
                    return obj.getNome();
                }
                return "";
            }

            @Override
            public Autor fromString(String string) {
                //TODO buscar por Autor
                return null;
            }
        });
        carregarListaAutores();
    }

    private void carregarListaAutores() {
        slAutor.getItems().add(new Autor("Leandro", "seila@seila", "111111"));
    }

}
