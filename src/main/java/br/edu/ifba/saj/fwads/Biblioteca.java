package br.edu.ifba.saj.fwads;

import br.edu.ifba.saj.fwads.model.Autor;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Biblioteca {
    public static ObservableList<Autor> listaAutores = FXCollections.observableArrayList();
    static{
        //listaAutores.add(new Autor("Jose","jose@seila.com","123.456.789.-11"));
    }
    
}
