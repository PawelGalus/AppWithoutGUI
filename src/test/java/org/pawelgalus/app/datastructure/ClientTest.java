package org.pawelgalus.app.datastructure;

import org.junit.Test;

public class ClientTest {

    @Test
    public void newClient() {
        Client client = new Client("1", "Pawel", null, "Galus");
        System.out.println(client.toString());
    }

}