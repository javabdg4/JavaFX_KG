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

    public boolean flag;

    public void handleSaveButton(ActionEvent actionEvent) {
//        System.out.println(name.getText());
//        System.out.println(lastName.getText());
//        System.out.println(street.getText());
//        System.out.println(city.getText());
//        System.out.println(postalCode.getText());
//        System.out.println(telephoneNumber.getText());

        if (!flag) {
            System.out.println("Zapis...");
            Person person = new Person(name.getText(), lastName.getText(), street.getText(), city.getText(), postalCode.getText(), telephoneNumber.getText());
            personView.getPersonList().add(person);
        } else {
            System.out.println("Edycja...");
            System.out.println(name.getText());
            System.out.println(lastName.getText());
            System.out.println(street.getText());
            System.out.println(city.getText());
            System.out.println(postalCode.getText());
            System.out.println(telephoneNumber.getText());


        }

    }

    public void handleCancelButton(ActionEvent actionEvent) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();

    }


    public void setPersonView(PersonView personView) {
        this.personView = personView;
    }

    public void setPersonEdit(Person person) {

        name.setText(person.getName());
        lastName.setText(person.getLastname());
        street.setText(person.getStreet());
        city.setText(person.getCity());
        postalCode.setText(person.getPostalCode());
        telephoneNumber.setText(person.getTelephone());

    }
}
