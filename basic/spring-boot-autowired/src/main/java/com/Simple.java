package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;  
import org.springframework.beans.factory.annotation.Autowired;  


import com.repository.*;

@SpringBootApplication
@RestController
public class Simple {

    @Autowired
    private IDuck duckRepository2;

    @RequestMapping("/")
    public String greeting() {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        duckRepository2.show();
        //duckRepository.show();
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

       
        return "Hello World!";
    }

    // public static void main(String[] args){
    //     // ApplicationContext ctx=new AnnotationConfigApplicationContext("application.xml");
    //     // IDuck duckService = (IDuck) ctx.getBean("duckRepository"); 
    //     // duckService.show();
    //     System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    //     duckRepository.show();
    //     System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        
    // }

    public static void main(String[] args) {
        SpringApplication.run(Simple.class, args);
    }
}



