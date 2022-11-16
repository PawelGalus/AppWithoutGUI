package org.pawelgalus.app.datastructure;

public class Client extends Person {
    final private String clientID;

    Client(String clientID, String firstName, String secondName, String surname) {
        super(firstName, secondName, surname);
        this.clientID = clientID;
    }

    String getClientID() {
        return this.clientID;
    }

    public String toString() {
        return getClientID() + " " + super.toString();
    }
}