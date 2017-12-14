package com.eason;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String greeting() {
        return "Hello World!";
    }

    @RequestMapping("/1")
    public String route1() {
        return "11111111111111!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}