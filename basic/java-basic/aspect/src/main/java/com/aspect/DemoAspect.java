package com.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoAspect {
  // @Before("@annotation(com.service.) && execution(public * *(..))")

  @Before("execution(* com.service.HelloService.createSample(..))")
  public void beforeService() {
    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
  }
}