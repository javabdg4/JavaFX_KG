package com.sda.javaFX.controller;

import com.sda.javaFX.model.Person;
import com.sda.javaFX.view.PersonView;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


public class PersonController {
    @FXML
    private TableView <Person> personTableView;
    @FXML
    private TableColumn <Person, String> nameCol;
    @FXML
    private TableColumn <Person, String> lastName;

    @FXML
    private Label nameLabel;
    @FXML
    private Label lastNameLabel;
    @FXML
    private Label streetLabel;
    @FXML
    private Label cityLabel;
    @FXML
    private Label postalCodeLabel;
    @FXML
    private Label telephoneLabel;

    private PersonView personView;

    public void setPersonView(PersonView personView) {
        this.personView = personView;
        personTableView.setItems(personView.getPersonList());
    }

    @FXML
    public void initialize() {
        System.out.println("To jest test");

        nameCol.setCellValueFactory(cell -> cell.getValue().nameProperty());
        lastName.setCellValueFactory(cell -> cell.getValue().lastnameProperty());
    }

}



