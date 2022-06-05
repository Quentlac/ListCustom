package com.example.listcustom;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.Callback;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML private VBox mainContainer;
    @FXML private ListView<Personne> listView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listView.getItems().addAll(
                new Personne("LACOMBE", "Quentin", 19, "quentlace2g@gmail.com"),
                new Personne("LIGNE", "Adrien", 19, "ligneadrien@gmail.com")
        );

        listView.setCellFactory(new Callback<ListView<Personne>, ListCell<Personne>>() {
            @Override
            public ListCell<Personne> call(ListView<Personne> personneListView) {
                return new TestItem();
            }
        });

    }
}