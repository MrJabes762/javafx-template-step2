module br.edu.ifba.saj.fwads {
    requires javafx.controls;
    requires javafx.fxml;    

    opens br.edu.ifba.saj.fwads.controller to javafx.fxml;    
    opens br.edu.ifba.saj.fwads.model to javafx.base, javafx.fxml;   
    
    exports br.edu.ifba.saj.fwads;
    exports br.edu.ifba.saj.fwads.model;

    
}
