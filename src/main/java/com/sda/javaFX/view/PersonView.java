package com.sda.javaFX.view;

import com.sda.javaFX.model.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PersonView {

    private ObservableList<Person> personList = FXCollections.observableArrayList();

    public ObservableList <Person> getPersonList() {
        return personList;
    }

    public PersonView(){
        personList.add(new Person("kamil","grabowski","torunska 170","bydgoszcz","85-000","661 960 136"));
        personList.add(new Person("diana","grabowska","dworcowa 77","bydgoszcz","85-002","666 222 222"));
        personList.add(new Person("robert","grabowski","dworcowa 71","bydgoszcz","85-002","554 123 321"));
        personList.add(new Person("dorota","lewandowska","torunska 31","bydgoszcz","85-003","664 044 222"));
        personList.add(new Person("grzegorz","lewandowski","przemyslowa 30","koszalin","75-137","842 221 233"));
        personList.add(new Person("jan","kowalski","szczecinska 32","koszalin","75-123","727 234 214"));
        personList.add(new Person("tomasz","witkowiak","mazowiecka 6","bydgoszcz","85-001","661 111 000"));

    }
}
