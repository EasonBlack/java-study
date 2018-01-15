package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping({"/test"})
public class TestController {
    @RequestMapping(value={"/hello"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public ResponseEntity<String> Hello(@RequestParam String name, HttpSession session) { 
        session.setAttribute("adminName", name);
        return new ResponseEntity<String>("Hello World", HttpStatus.OK);
    }

    @RequestMapping({"/session"})
    public String hello(HttpSession session) {
      return (String)session.getAttribute("adminName");
    }
}


