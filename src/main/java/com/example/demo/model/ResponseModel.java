package com.example.demo.model;

public class ResponseModel {
    private String name;
    private String uuid;
    private PublicApiResponse apiResponse;

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public PublicApiResponse getApiResponse() {
        return apiResponse;
    }

    public void setApiResponse(PublicApiResponse apiResponse) {
        this.apiResponse = apiResponse;
    }
}
