package com.savior.conversor.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.savior.conversor.model.CurrencyResponse;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClient {
    private final String apiKey = "e72a8e2eba55cc15b4b2d099";
    private String apiURL = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/";
    Gson gson = new GsonBuilder().setPrettyPrinting().setPrettyPrinting().create();

    public ApiClient(String code) {
        this.apiURL += code;
    }

    public CurrencyResponse getExchangeRate() {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(this.apiURL))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            return gson.fromJson(response.body(), CurrencyResponse.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
