package com.eason;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



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

    @RequestMapping(value="/owners/{ownerId}")  
    @ResponseBody
    public String getValue(@PathVariable String ownerId) {
        return "This is "  + ownerId ;
    }

    @RequestMapping(value="/test")  
    public String getTestName( @RequestParam String testname) {
        return "That is "  + testname ;
    }

    @RequestMapping(value="/posttest", method = RequestMethod.POST)  
    public String getPost(@RequestBody PostModel pm) {
        return pm.getName() + " : " + pm.getNum() ;
    }

    @RequestMapping(value="/posttest2", method = RequestMethod.POST)  
    public String getPost(@RequestBody PostModel2 pm) {
        return pm.name + " " + pm.num  + " !!" ;
    }

    @RequestMapping(value="/postjson", method = RequestMethod.POST)  
    public JSONObject  getJsonString(@RequestBody String stringToParse) {
        JSONParser parser = new JSONParser();
        JSONObject json = null;
        try {
            json = (JSONObject) parser.parse(stringToParse);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return json;
    }

    @RequestMapping(value="/postmap", method = RequestMethod.POST)  
    public String  getJsonString(@RequestBody Map<String, String> payload) {
        String jsonText = JSONValue.toJSONString(payload);
        return jsonText;
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}