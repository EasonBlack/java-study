package com.eason;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.*;
import java.util.List;

import com.eason.User;
import com.eason.UserRepository;



@SpringBootApplication
@RestController
public class Application {

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public User hello() {
        User user = userRepository.findOne(1L);
        return user;
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}