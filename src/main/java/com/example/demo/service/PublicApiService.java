package com.example.demo.service;

import com.example.demo.exception.ApiRequestException;
import com.example.demo.model.ApiResponse;
import com.example.demo.model.PublicApiResponse;
import com.example.demo.model.Status;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


@Service
@RequiredArgsConstructor
public class PublicApiService {
    private final WebClient webClient;

    public ApiResponse getPublicApiResponse() {
        PublicApiResponse data= this.webClient.get()
                .uri("https://jsonplaceholder.typicode.com/posts/1")
                .retrieve()
                .bodyToMono(PublicApiResponse.class)
                .blockOptional()
                .orElseThrow(() -> new ApiRequestException(Status.ERROR,"Error al recuperar los datos de la API"));

        return ApiResponse.builder()
                .status(Status.SUCCESS)
                .message("Datos extraidos correctamente")
                .data(data)
                .build();
    }
}