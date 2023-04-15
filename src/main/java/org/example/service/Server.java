package org.example.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.xml.ws.Endpoint;

@Component
@RequiredArgsConstructor
public class Server {

    public static final String DEFAULT_ADDRESS = "http://localhost:8000/storageservice";

    private final StorageService service;

    public void start() {
        Endpoint.publish(DEFAULT_ADDRESS, service);
    }
}
