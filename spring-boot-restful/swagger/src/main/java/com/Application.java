package com;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import org.springframework.context.annotation.PropertySource;
import org.springframework.beans.factory.annotation.Value;

@PropertySource("classpath:application-default.properties")
@SpringBootApplication
@RestController
public class Application {

    @Value("${test.name}")
	private String testName;

    @ApiOperation(value="get books", notes="get book list")
    @RequestMapping(value={"/book"}, method= RequestMethod.GET)
    public String getBook() {
        
        return "Test" + testName;
    }


    @RequestMapping("/")
    public String greeting() {
        return "Hello World!";
    }

    @ApiOperation(value="xxxxx", notes="dddd")
    @RequestMapping("/1")
    public String route1() {
        return "11111111111111!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}