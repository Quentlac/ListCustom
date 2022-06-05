package com.example.listcustom;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;

import java.io.IOException;

public class TestItem extends ListCell<Personne> {

    private Node rootNode;
    private ItemController itemController;

    public TestItem() {
        super();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("list-item.fxml"));
        try {
            this.rootNode = fxmlLoader.load();
            itemController = (ItemController) fxmlLoader.getController();
            System.out.println("test");
        }
        catch (IOException e) {
            System.out.println("Erreur " + e);
        }
    }

    @Override
    protected void updateItem(Personne p, boolean empty) {
        super.updateItem(p, empty);

        if(p != null) {
            itemController.setPersonne(p);
            setGraphic(rootNode);
        }
    }
}
