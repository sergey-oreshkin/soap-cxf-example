package org.example;

import org.example.dto.Dto;
import org.example.service.StorageService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class Client {
    public static void main(String[] args) throws MalformedURLException {
        QName serviceName = new QName("http://localhost:8000/storageservice", "StorageService");
        QName servicePort = new QName("http://localhost:8000/storageservice", "StoragePort");
        Service service = Service.create(new URL("http://localhost:8000/storageservice?wsdl"), serviceName);
        StorageService ss = service.getPort(StorageService.class);
        System.out.println(ss.getDto("kjhgjh"));
        ss.setDto(new Dto("34543"));
    }
}
