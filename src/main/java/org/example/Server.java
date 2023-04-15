package org.example;


import org.example.service.StorageServiceImpl;

import javax.xml.ws.Endpoint;

public class Server {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8000/storageservice", new StorageServiceImpl());
    }
}
