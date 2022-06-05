package com.example.listcustom;

import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ItemController implements Initializable {

    @FXML private Label name;
    @FXML private Label mail;

    private Personne personne;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


    public void setPersonne(Personne personne) {
        this.personne = personne;
        name.textProperty().bind(personne.nomProperty());
        mail.textProperty().bind(personne.mailProperty());
    }
}
