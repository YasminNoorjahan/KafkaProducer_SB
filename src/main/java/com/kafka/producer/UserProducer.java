package com.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserProducer {
    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    private String topicName = "user";

    public void sendUser(User User) {
        kafkaTemplate.send(topicName, User);
        System.out.println("Sent User: " + User);
    }
}