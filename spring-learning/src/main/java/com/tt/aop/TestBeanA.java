package com.tt.aop;

public class TestBeanA {
    private TestBeanB testBeanB;

    public void test1() {
        System.out.println("testA do testB");
    }

    public void setTestBeanB(TestBeanB testBeanB) {
        this.testBeanB = testBeanB;
    }
}
