package com.springboot.ChatGPT.service;

import com.springboot.ChatGPT.dto.ChatGPTRequest;
import com.springboot.ChatGPT.dto.ChatGPTResponse;
import com.springboot.ChatGPT.dto.PromptRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class ChatGPTService {

    private final RestClient restClient;

    public ChatGPTService(RestClient restClient) {
        this.restClient = restClient;
    }

    @Value("${openapi.api.key}")
    private String apikey;

    @Value("${openapi.api.model}")
    private String model;

    public String getChatResponse(PromptRequest promptRequest) {

        try {
            ChatGPTRequest chatGPTRequest = new ChatGPTRequest(
                    model,
                    List.of(new ChatGPTRequest.Message("user", promptRequest.prompt()))
            );

            ChatGPTResponse response = restClient.post()
                    .uri("https://openrouter.ai/api/v1/chat/completions")
                    .header("Authorization", "Bearer " + apikey)
                    .header("Content-Type", "application/json")
                    .body(chatGPTRequest)
                    .retrieve()
                    .body(ChatGPTResponse.class);

            if (response == null || response.choices() == null || response.choices().isEmpty()) {
                return "No response from API";
            }

            return response.choices().get(0).message().content();

        } catch (Exception e) {
            e.printStackTrace();   // 👈 THIS IS KEY
            return "Error: " + e.getMessage();
        }
    }
}