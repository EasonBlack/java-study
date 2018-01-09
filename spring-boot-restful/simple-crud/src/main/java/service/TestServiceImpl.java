package com.eason.service.impl;
import org.springframework.stereotype.Service;
import com.eason.service.TestService;


@Service
public class TestServiceImpl implements TestService{
    @Override
    public String TestA(String xx) {
        return "Thsi is " + xx;
    }
}