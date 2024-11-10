package com.akashonlinehere.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
    // this si where we add all of our related advices for logging

    // let's start with an @Before Advice

    @Before("execution(* com.akashonlinehere.aopdemo.dao.*.*(..))")
    public void beforeAddAccountAdvice(){
        System.out.println("\n  =====> Executing @Before advice on method");
    }
}
