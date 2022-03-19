package com.tt.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application3.xml");
        TestBeanB testBeanB = (TestBeanB) context.getBean("testBeanB");
        TestBeanA testBeanA = (TestBeanA) context.getBean("testBeanA");

        testBeanB.test();

        testBeanA.test1();
    }
}
