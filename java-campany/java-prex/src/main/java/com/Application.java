
package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.PropertySource;


@PropertySource("classpath:application-default.properties")
@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String greeting() {
        return "Hello World!";
    }

    @RequestMapping("/1")
    public String route1() {
        return "111111111111111111111!";
    }

    @RequestMapping("/2")
    public String route2() {
        return "5555555555555555!";
    }

    @RequestMapping("/3")
    public String route3() {
        return "99999999999999999!";
    }

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Application.class);
        ApplicationContext ctx = springApplication.run(args);
      
    }
}