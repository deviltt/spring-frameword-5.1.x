package com.app2;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class PersonTest {
	@Test
	public void test1() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application2.xml");

		List<String> person = (List<String>) context.getBean("person");

		System.out.println(person);
	}
}
