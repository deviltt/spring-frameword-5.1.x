package com.tt;

import org.junit.Test;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class FactoryBeanTest1 {
	@Test
	public void test1() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application2.xml");

		List<Integer> list = (List<Integer>) context.getBean("factoryBeanTest");

		// 带 & 相当于返回 FactoryBean本身
		FactoryBeanTest factoryBeanTest = (FactoryBeanTest) context.getBean("&factoryBeanTest");

		System.out.println(list);

		System.out.println(factoryBeanTest);
	}
}
