package com.tt;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredTest {
	@Test
	public void test1() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application4.xml");

		User user = (User) context.getBean("user");

		System.out.println(user);
	}
}
