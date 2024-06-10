package com.example.demo.model;
import lombok.Data;
import lombok.Builder;


@Data
@Builder
public class ApiResponse {
    private Status status;
    private String message;
    private PublicApiResponse data;

}