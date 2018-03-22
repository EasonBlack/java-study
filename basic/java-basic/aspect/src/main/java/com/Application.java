package com;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;

import com.service.HelloService;


@SpringBootApplication
@RestController
public class Application {
    
    @Autowired
    HelloService helloservice;

    @RequestMapping("/")
    public String greeting() {
        String _sample = helloservice.createSample();
        return "Hello World!" + _sample;
    }

    @RequestMapping("/1")
    public String route1() {
        return "11111111111111!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}