package com.example.demo.model;
import lombok.Data;
import lombok.Builder;


@Data
@Builder
public class PublicApiResponse {
    private int userId;
    private int id;
    private String title;
    private String body;

}