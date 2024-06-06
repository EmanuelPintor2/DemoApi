package com.example.demo.service;

import com.example.demo.model.PublicApiResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class PublicApiService {
    private final WebClient webClient;

    public PublicApiService() {
        this.webClient = WebClient.create();
    }

    public PublicApiResponse getPublicApiResponse() {
        try {
            Mono<PublicApiResponse> response = this.webClient.get()
                    .uri("https://jsonplaceholder.typicode.com/posts/1")
                    .retrieve()
                    .bodyToMono(PublicApiResponse.class);

            return response.block();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
