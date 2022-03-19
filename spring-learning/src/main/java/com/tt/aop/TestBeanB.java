package com.tt.aop;

public class TestBeanB {
    private TestBeanA testBeanA;

    public void test() {
        System.out.println("testB do testA");
    }

    public void setTestBeanA(TestBeanA testBeanA) {
        this.testBeanA = testBeanA;
    }
}
