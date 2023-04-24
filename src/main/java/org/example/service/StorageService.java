package org.example.service;

import org.example.dto.Dto;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = Server.DEFAULT_NAMESPACE, name = "StorageService")
public interface StorageService {

    Dto getDto(@WebParam(name = "id", targetNamespace = Server.DEFAULT_NAMESPACE) String id);

    void setDto(@WebParam(name = "dto", targetNamespace = Server.DEFAULT_NAMESPACE) Dto dto);
}
