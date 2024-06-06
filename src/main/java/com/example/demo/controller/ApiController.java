package com.example.demo.controller;

import com.example.demo.model.PublicApiResponse;
import com.example.demo.model.ResponseModel;
import com.example.demo.service.PublicApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ApiController {

    @Autowired
    private PublicApiService publicApiService;

    @GetMapping("/api/data")
    public ResponseModel getData() {
        ResponseModel response = new ResponseModel();
        response.setName("Emanuel");
        response.setUuid(UUID.randomUUID().toString());
        response.setApiResponse(publicApiService.getPublicApiResponse());
        return response;
    }
}