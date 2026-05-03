package com.springboot.ChatGPT.controller;


import com.springboot.ChatGPT.dto.ChatGPTResponse;
import com.springboot.ChatGPT.dto.PromptRequest;
import com.springboot.ChatGPT.service.ChatGPTService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/chat")
public class ChatGptController  {

    private final ChatGPTService chatGPTService;

    public ChatGptController(ChatGPTService chatGPTService) {
        this.chatGPTService = chatGPTService;

    }
    @PostMapping
    public String chat(@RequestBody PromptRequest promptRequest) {
        return chatGPTService.getChatResponse(promptRequest);
    }
    }

