package com.example.demo.controller;

import com.example.demo.model.ResponseModel;
import com.example.demo.service.PublicApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.UUID;

@RestController
@RequestMapping("/microservice")
@RequiredArgsConstructor
public class ApiController {

    private final PublicApiService publicApiService;

    @GetMapping("/retornojson")
    public ResponseModel getData() {
        ResponseModel response = ResponseModel.builder().build();
        response.setName("Emanuel");
        response.setUuid(UUID.randomUUID().toString());
        response.setApiResponse(publicApiService.getPublicApiResponse());
        return response;
    }
}