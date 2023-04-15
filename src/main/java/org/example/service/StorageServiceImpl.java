package org.example.service;

import org.example.dto.Dto;

import javax.jws.WebService;

@WebService(serviceName = "StorageService",
        portName = "StoragePort",
        targetNamespace = "http://localhost:8000/storageservice",
        endpointInterface = "org.example.service.StorageService")
public class StorageServiceImpl implements StorageService {
    @Override
    public Dto getDto(String id) {
        return new Dto(id);
    }

    @Override
    public void setDto(Dto dto) {
        System.out.println(dto);
    }
}
