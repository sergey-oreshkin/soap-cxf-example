package org.example.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.xml.ws.Endpoint;

@Component
@RequiredArgsConstructor
public class Server {

    public static final String DEFAULT_NAMESPACE = "http://localhost:8000/service";
    public static final String DEFAULT_ADDRESS = "http://0.0.0.0:8000/service";

    private final StorageService service;

    public void start() {
        Endpoint.publish(DEFAULT_ADDRESS, service);
    }
}
