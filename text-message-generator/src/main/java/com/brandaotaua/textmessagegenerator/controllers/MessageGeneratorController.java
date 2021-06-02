package com.brandaotaua.textmessagegenerator.controllers;

import com.brandaotaua.textmessagegenerator.configuration.MessageConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageGeneratorController {

    private static final String MESSAGE_TEMPLATE = "%s, %s, %s";

    private final MessageConfiguration messageConfiguration;

    public MessageGeneratorController(MessageConfiguration messageConfiguration) {
        this.messageConfiguration = messageConfiguration;
    }

    @GetMapping("/welcome/{name}")
    public ResponseEntity<String> generateWelcomeMessage(@PathVariable String name) {
        return ResponseEntity.ok(
                String.format(MESSAGE_TEMPLATE, messageConfiguration.getWelcome(), name, messageConfiguration.getWelcomeMessage()));
    }

    @GetMapping("/bye/{name}")
    public ResponseEntity<String> generateByeMessage(@PathVariable String name) {
        return ResponseEntity.ok(
                String.format(MESSAGE_TEMPLATE, messageConfiguration.getBye(), name, messageConfiguration.getByeMessage()));
    }

}
