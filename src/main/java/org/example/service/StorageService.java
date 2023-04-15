package org.example.service;

import org.example.dto.Dto;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://localhost:8000/storageservice", name = "StorageService")
public interface StorageService {

    Dto getDto(@WebParam(name = "id", targetNamespace = "http://localhost:8000/storageservice") String id);

    void setDto(@WebParam(name = "dto", targetNamespace = "http://localhost:8000/storageservice") Dto dto);
}
