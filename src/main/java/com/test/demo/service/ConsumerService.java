package com.test.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.test.demo.model.Message;
import com.test.demo.repository.MessageRepository;

@Service
public class ConsumerService {

    @Autowired
    private MessageRepository msgRepo;

    @KafkaListener(topics = "msg", groupId = "123")
    public void consume(String msg) {
        System.out.println("Consuming and saving a message ... " + msg);
        Message m = new Message();
        m.setMsg(msg);
        msgRepo.save(m);
    }

}
