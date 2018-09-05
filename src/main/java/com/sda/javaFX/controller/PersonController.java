package com.sda.javaFX.controller;

import com.sda.javaFX.model.Person;
import com.sda.javaFX.view.PersonView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


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
        personTableView.getSelectionModel().selectedItemProperty().addListener((observable, oldField, newField) -> viewPersonInfoOnLabel(newField));
    }

    public void viewPersonInfoOnLabel(Person person) {
        nameLabel.setText(person.getName());
        lastNameLabel.setText(person.getLastname());
        streetLabel.setText(person.getStreet());
        cityLabel.setText(person.getCity());
        postalCodeLabel.setText(person.getPostalCode());
        telephoneLabel.setText(person.getTelephone());


    }

    public void handleSaveButton(ActionEvent actionEvent) {

        System.out.println("Save");

    }


    public void handleNewButton(ActionEvent actionEvent) {
        System.out.println("New");
        personView.loadNewView();
    }

    public void handleEditButton(ActionEvent actionEvent) {

        Person selectPerson = personTableView.getSelectionModel().getSelectedItem();
        int index = personTableView.getSelectionModel().getFocusedIndex();

//        personView.getPersonList().set(2, xx)// przykład
        System.out.println(selectPerson.toString());
        personView.loadEditView(selectPerson, index);
    }

    public void handleDeleteButton(ActionEvent actionEvent) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure", ButtonType.YES, ButtonType.NO);

        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {
            System.out.println("Usuwanie...");
        }


        Person personToDelete = personTableView.getSelectionModel().getSelectedItem();
        personView.getPersonList().remove(personToDelete);
        personView.loadDeleteView();
        System.out.println("Delete");
    }
}



