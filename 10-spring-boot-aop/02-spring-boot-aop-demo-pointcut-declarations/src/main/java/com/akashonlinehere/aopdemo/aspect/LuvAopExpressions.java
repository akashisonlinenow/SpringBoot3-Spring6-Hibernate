package com.akashonlinehere.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LuvAopExpressions {
    @Pointcut("execution(* com.akashonlinehere.aopdemo.dao.*.*(..))")
    public void forDaoPackage() {}

    // create a pointcut for getter method
    @Pointcut("execution(* com.akashonlinehere.aopdemo.dao.*.get*(..))")
    public void getter(){}

    // create a pointcut for setter methods
    @Pointcut("execution(* com.akashonlinehere.aopdemo.dao.*.set*(..))")
    public void setter(){}

    // create pointcut: iclude package... exclude getter/setter
    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void forDaoPackageNoGetterSetter(){}
}
