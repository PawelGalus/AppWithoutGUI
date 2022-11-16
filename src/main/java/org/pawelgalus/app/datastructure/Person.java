package org.pawelgalus.app.datastructure;

public interface Person {
    String firstName;
    String secondName;
    String surname;

    Person(String firstName, String secondName, String surname) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.surname = surname;
    }
}
