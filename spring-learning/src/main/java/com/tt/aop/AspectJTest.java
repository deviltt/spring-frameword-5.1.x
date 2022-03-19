package com.tt.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

@Aspect
public class AspectJTest {
    @Pointcut("execution(* *.test(..))")
    public void test() {

    }

    @Before("test()")
    @Order(1)
    public void beforeTest() {
        System.out.println("beforeTest");
    }

    @After("test()")
    public void afterTest() {
        System.out.println("afterTest");
    }

    @Around("test()")
    @Order(2)
    public Object aroundTest(ProceedingJoinPoint p) {
        System.out.println("before1");
        Object o = null;
        try {
            p.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("after1");
        return o;
    }

    @AfterThrowing("test()")
    public void afterThrowing() {
        System.out.println("afterThrowing");
    }

    @AfterReturning("test()")
    public void afterReturning() {
        System.out.println("afterReturning");
    }
}
