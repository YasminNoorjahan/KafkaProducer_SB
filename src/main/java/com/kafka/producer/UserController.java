package com.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class UserController {
    @Autowired
    UserProducer userProducer;

    Long i=1L;
    @PostMapping("/user")
    public void login(@RequestBody User user){
        userProducer.sendUser(new User((long) i++, user.getName()));
    }
}
