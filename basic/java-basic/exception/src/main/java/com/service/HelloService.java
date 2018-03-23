package com.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String createSample() {
        String sample = "XXX xXXXX";
        return sample;
    }

    public String exceptionTry1() throws Exception  {
        throw new Exception("This is an exception");
    }
}