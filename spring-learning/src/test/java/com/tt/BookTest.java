package com.tt;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {
	@Test
	public void test1() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application1.xml");

		Book booka = (Book) context.getBean("booka");
		Book bookb = (Book) context.getBean("bookb");

//		System.out.println(booka==bookb);

		System.out.println(context.getBeanFactory().getBeanDefinition("book1").getAttribute("name"));

		Assert.assertEquals(booka, bookb);

		context.close();
	}

	@Test
	public void test2(){

	}
}
