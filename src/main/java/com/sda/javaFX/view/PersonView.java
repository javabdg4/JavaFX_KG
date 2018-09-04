package com.sda.javaFX.view;

import com.sda.javaFX.Main;
import com.sda.javaFX.controller.NewPersonController;
import com.sda.javaFX.controller.PersonController;
import com.sda.javaFX.model.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class PersonView {

    private VBox vBox;
    private Stage stage;


    public ObservableList <Person> personList = FXCollections.observableArrayList();

    public ObservableList <Person> getPersonList() {
        return personList;
    }

    public PersonView(Stage stage){
        this.stage = stage;
        personList.add(new Person("kamil", "grabowski", "torunska 170", "bydgoszcz", "85-000", "661 960 136"));
        personList.add(new Person("diana", "grabowska", "dworcowa 77", "bydgoszcz", "85-002", "666 222 222"));
        personList.add(new Person("robert", "grabowski", "dworcowa 71", "bydgoszcz", "85-002", "554 123 321"));
        personList.add(new Person("dorota", "lewandowska", "torunska 31", "bydgoszcz", "85-003", "664 044 222"));
        personList.add(new Person("grzegorz", "lewandowski", "przemyslowa 30", "koszalin", "75-137", "842 221 233"));
        personList.add(new Person("jan", "kowalski", "szczecinska 32", "koszalin", "75-123", "727 234 214"));
        personList.add(new Person("tomasz", "witkowiak", "mazowiecka 6", "bydgoszcz", "85-001", "661 111 000"));

    }


    public PersonView() {

    }

    public void loadNewView() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("/NewEditView.fxml"));
        VBox newPersonView = null;
        try {
            newPersonView = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stage newPersonStage = new Stage();
        Scene newPersonScene = new Scene(newPersonView);
        newPersonStage.setScene(newPersonScene);
        newPersonStage.show();
       NewPersonController newPersonController = loader.getController();
       newPersonController.setPersonView(this);
    }

    public void loadView() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("/RootView.fxml"));
        try {
            vBox = (VBox) loader.load();
            Scene scene = new Scene(vBox);
            stage.setScene(scene);
            stage.show();

            PersonController personController = loader.getController();
            personController.setPersonView(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

