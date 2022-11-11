package com.test.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.model.Message;
import com.test.demo.repository.MessageRepository;

@RestController
public class MainController {

    @Autowired
    MessageRepository msgRepo;

    @GetMapping("/messages")
    public List<Message> viewMessages(Model model) {
        return msgRepo.findAll();
    }

}
