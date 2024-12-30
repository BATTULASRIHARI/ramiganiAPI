package com.example.ramiganiAPI.controller;

import com.example.ramiganiAPI.entity.QuoteForm;
import com.example.ramiganiAPI.entity.MessageForm;
import com.example.ramiganiAPI.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/forms")
public class FormController {

    @Autowired
    private FormService formService;

    // Submit Quote Form
    @PostMapping("/quote")
    public ResponseEntity<String> submitQuoteForm(@RequestBody QuoteForm quoteForm) {
        formService.saveQuoteForm(quoteForm);
        return ResponseEntity.ok("Quote form submitted successfully!");
    }

    // Submit Message Form
    @PostMapping("/message")
    public ResponseEntity<String> submitMessageForm(@RequestBody MessageForm messageForm) {
        formService.saveMessageForm(messageForm);
        return ResponseEntity.ok("Message form submitted successfully!");
    }

    // Get all Quote Forms
    @GetMapping("/quote")
    public ResponseEntity<List<QuoteForm>> getAllQuoteForms() {
        List<QuoteForm> quoteForms = formService.getAllQuoteForms();
        return ResponseEntity.ok(quoteForms);
    }

    // Get all Message Forms
    @GetMapping("/message")
    public ResponseEntity<List<MessageForm>> getAllMessageForms() {
        List<MessageForm> messageForms = formService.getAllMessageForms();
        return ResponseEntity.ok(messageForms);
    }
}
