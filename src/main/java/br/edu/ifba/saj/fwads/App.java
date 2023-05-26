package br.edu.ifba.saj.fwads;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {
    
    private static Scene scene;    

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(App.class.getResource("controller/Login.fxml"));
        scene = new Scene(loader.load(), 800, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) {
        try {
            scene.setRoot(loadFXML(fxml));
        } catch (Exception e) {
            new Alert(AlertType.ERROR, "Erro ao carregar o arquivo " + fxml).show();
            e.printStackTrace();
        }
    }

    private static Parent loadFXML(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader(App.class.getResource(fxml));
        Parent parent = loader.load();
        Object controller =loader.getController();
        if(controller!= null){
            parent.getProperties().put("controller", loader.getController());
        }
        return parent;
    }

    public static void main(String[] args) {
        launch();
    }

}