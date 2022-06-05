package com.example.listcustom;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Personne {

    private StringProperty nom;
    private StringProperty prenom;
    private IntegerProperty age;
    private StringProperty mail;


    public Personne(String nom, String prenom, int age, String mail) {
        this.nom = new SimpleStringProperty();
        this.prenom = new SimpleStringProperty();
        this.age = new SimpleIntegerProperty();
        this.mail = new SimpleStringProperty();

        setNom(nom);
        setPrenom(prenom);
        setAge(age);
        setMail(mail);
    }

    public void setPrenom(String prenom) {
        this.prenom.set(prenom);
    }

    public void setNom(String nom) {
        this.nom.set(nom);
    }

    public void setAge(int age) {
        this.age.set(age);
    }

    public void setMail(String mail) {
        this.mail.set(mail);
    }

    public StringProperty nomProperty() {
        return nom;
    }

    public StringProperty prenomProperty() {
        return prenom;
    }

    public StringProperty mailProperty() {
        return mail;
    }
}
