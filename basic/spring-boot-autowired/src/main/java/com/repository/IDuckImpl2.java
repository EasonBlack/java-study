package com.repository;
 
import org.springframework.stereotype.Repository;
 
 @Repository("duckRepository2")
 public class IDuckImpl2 implements IDuck{
 
    @Override
    public void show() {
         System.out.println("This is another duck");
    }
 }