package com.tt;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AbstractJobTest {
	@Test
	public void test1(){
		ApplicationContext context=new ClassPathXmlApplicationContext("application1.xml");

		System.out.println(context.getBean("job1"));
	}
}
