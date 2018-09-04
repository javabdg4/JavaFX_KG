package com.sda.javaFX.controller;

import com.sda.javaFX.model.Person;
import com.sda.javaFX.view.PersonView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NewPersonController {


    @FXML
    private TextField name;
    @FXML
    private TextField lastName;
    @FXML
    private TextField street;
    @FXML
    private TextField city;
    @FXML
    private TextField postalCode;
    @FXML
    private TextField telephoneNumber;
    @FXML
    private Button closeButton;

    private PersonView personView;

    //    public void viewNewPersonInfoOnLabel(Person person) {
//        nameLabel.setText(person.getName());
//        lastNameLabel.setText(person.getLastname());
//        streetLabel.setText(person.getStreet());
//        cityLabel.setText(person.getCity());
//        postalCodeLabel.setText(person.getPostalCode());
//        telephoneLabel.setText(person.getTelephone());
//    }

    public void handleSaveButton(ActionEvent actionEvent) {
        System.out.println(name.getText());
        System.out.println(lastName.getText());
        System.out.println(street.getText());
        System.out.println(city.getText());
        System.out.println(postalCode.getText());
        System.out.println(telephoneNumber.getText());
        Person person = new Person(name.getText(), lastName.getText(), street.getText(), city.getText(), postalCode.getText(), telephoneNumber.getText());
        personView.getPersonList().add(person);
        handleCancelButton(actionEvent);
    }

    public void handleCancelButton(ActionEvent actionEvent) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();

    }


    public void setPersonView(PersonView personView) {
        this.personView = personView;
    }
}
