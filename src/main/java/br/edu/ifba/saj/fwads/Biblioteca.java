package br.edu.ifba.saj.fwads;

import br.edu.ifba.saj.fwads.model.Autor;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Biblioteca {
    public static ObservableList<Autor> listaAutores = FXCollections.observableArrayList();
    static{
        listaAutores.add();
    }
    @FXML
    void observandoLista(ActionEvent event) {
        
    }

}
