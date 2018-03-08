package com;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
@RestController
public class Application  extends SpringBootServletInitializer {

    @RequestMapping("/")
    public String greeting() {
        return "Hello World Hello World Again!";
    }

    @RequestMapping("/1")
    public String route1() {
        return "11111111111111!";
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
}