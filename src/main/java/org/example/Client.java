package org.example;

import org.example.dto.Dto;
import org.example.service.Server;
import org.example.service.StorageService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class Client {
    public static void main(String[] args) throws MalformedURLException {
        QName serviceName = new QName(Server.DEFAULT_NAMESPACE, "StorageService");
        Service service = Service.create(new URL(Server.DEFAULT_NAMESPACE + "?wsdl"), serviceName);
        StorageService ss = service.getPort(StorageService.class);
        System.out.println(ss.getDto("12345"));
        ss.setDto(new Dto("54321"));
    }
}
