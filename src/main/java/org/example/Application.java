package org.example;

import org.example.config.ApplicationConfig;
import org.example.service.Server;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Server server = context.getBean(Server.class);
        server.start();
    }
}
