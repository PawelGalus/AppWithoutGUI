package org.pawelgalus.app.datastructure;

public class Person implements iPerson {
    private String firstName;
    private String secondName;
    private String surname;

    Person(String firstName, String secondName, String surname) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.surname = surname;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        if(secondName != null) {
            return this.secondName;
        }
        else {
            return "";
        }
    }

    public String getSurname() {
        return this.surname;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String toString() {
        return getFirstName() + " " + getSecondName() + " " + getSurname();
    }
}