package com.repository;
 
import org.springframework.stereotype.Repository;
 
 @Repository("duckRepository")
 public class IDuckImpl implements IDuck{
 
    @Override
    public void show() {
         System.out.println("This is a duck");
    }
 }