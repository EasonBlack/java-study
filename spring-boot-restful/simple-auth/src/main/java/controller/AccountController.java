package com.eason.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import javax.servlet.http.HttpSession;
import java.util.*;
import org.springframework.security.access.prepost.PreAuthorize;

import com.eason.service.AccountService;

@RestController
public class AccountController {
    
    @Autowired 
    private AccountService accountService;


    @RequestMapping(value={"/public/{message}"})
    public String getPublicHello(@PathVariable String message) { 
        return "Public Hello World" + message;
    }


    @RequestMapping(value={"/hello"})
    @PreAuthorize("hasRole('ADMIN')")
    public String getHello() { 
        return accountService.getThk();
    }

    @RequestMapping(value={"/private/{message}"})
    public String getPrivateHello(@PathVariable String message) { 
        return "Private Hello World" + message;
    }
    
}


