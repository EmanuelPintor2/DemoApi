package com.example.demo.model;

import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class ResponseModel {
    private String name;
    private String uuid;
    private ApiResponse apiResponse;
}
