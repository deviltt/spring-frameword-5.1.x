package com.config;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ActiveProfiles;

public class ConfigurationBeanTest {
	@Test
	public void test1() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationBean.class);
		System.out.println(context.getBean("user"));
	}
}
