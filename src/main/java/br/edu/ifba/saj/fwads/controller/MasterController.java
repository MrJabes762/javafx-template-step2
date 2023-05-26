package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;

public class MasterController {

    @FXML
    private BorderPane masterPane;

    @FXML
    private VBox menu;

    @FXML
    private Label userEmail;

    @FXML
    private Circle userPicture;

    @FXML
    void logOff(MouseEvent event) {
        Alert alert = new Alert(AlertType.CONFIRMATION, "Deseja realmente sair??", ButtonType.YES, ButtonType.NO);
        alert.showAndWait()
            .filter(response -> response == ButtonType.YES)
            .ifPresent(response -> {
                App.setRoot("controller/Login.fxml");            
            });
    }

    @FXML
    void showHome(ActionEvent event) {
        limparBotoes(event.getSource());        
    }

    @FXML
    void showUsuarios(ActionEvent event) {
        limparBotoes(event.getSource());
    }

    private void limparBotoes(Object source){
        menu.getChildren().forEach((node) -> 
            {
                if(node instanceof Button btn){
                    btn.getStyleClass().clear();
                    btn.getStyleClass().add("btn-menu");
                }
            }

        );
        if(source instanceof Button btn){
            btn.getStyleClass().clear();
            btn.getStyleClass().add("btn-menu-selected");
        }
    }

}
