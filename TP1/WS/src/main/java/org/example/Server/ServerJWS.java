package org.example.Server;

import jakarta.xml.ws.Endpoint;
import org.example.webservice.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {

        var address = "http://0.0.0.0:9191/";

        Endpoint.publish(address, new BanqueService());
        System.out.println("Server is running on " + address + " ...");

    }

}
