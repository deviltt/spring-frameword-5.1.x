package com.tt;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
	@Test
	public void test1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("application1.xml");

		User user = (User) context.getBean("user1");

		System.out.println(user);
	}
}
