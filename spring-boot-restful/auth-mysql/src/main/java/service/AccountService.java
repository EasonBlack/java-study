package com.eason.service;

import org.springframework.stereotype.Service;
import org.springframework.security.access.prepost.PreAuthorize;



@Service
public class AccountService {

    public String getThk() {
        return "Thank you";
    }
}