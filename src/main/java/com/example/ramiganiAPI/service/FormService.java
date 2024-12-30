package com.example.ramiganiAPI.service;

import com.example.ramiganiAPI.entity.QuoteForm;
import com.example.ramiganiAPI.entity.MessageForm;
import com.example.ramiganiAPI.repository.QuoteFormRepository;
import com.example.ramiganiAPI.repository.MessageFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormService {

    @Autowired
    private QuoteFormRepository quoteFormRepository;

    @Autowired
    private MessageFormRepository messageFormRepository;

    public QuoteForm saveQuoteForm(QuoteForm quoteForm) {
        return quoteFormRepository.save(quoteForm);
    }

    public MessageForm saveMessageForm(MessageForm messageForm) {
        return messageFormRepository.save(messageForm);
    }

    public List<QuoteForm> getAllQuoteForms() {
        return quoteFormRepository.findAll();
    }

    public List<MessageForm> getAllMessageForms() {
        return messageFormRepository.findAll();
    }
}