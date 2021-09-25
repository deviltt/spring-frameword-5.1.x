package com.tt;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {
	@Test
	public void test1() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application1.xml");

		Book book = (Book) context.getBean("book");

		System.out.println(book);

		context.close();
	}
}
