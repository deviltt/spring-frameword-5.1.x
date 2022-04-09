package com.tt;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class UserTest {
	@Test
	public void test1() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application1.xml");

		Book book = (Book) context.getBean("book1");

		String action = (String) context.getBeanFactory().getBeanDefinition("book1").getAttribute("action");

		System.out.println(action);

		System.out.println(book);
	}

	/**
	 * 测试反射，通过反射的方式设置方法的属性
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception {
		// 反射注入属性
		User user = new User();

		Class<? extends User> clazz = user.getClass();

		Field nameFiled = clazz.getDeclaredField("name");

		nameFiled.setAccessible(true);

		Object haha = nameFiled.getType().getConstructor(String.class).newInstance("haha");

		nameFiled.set(user, haha);

		System.out.println(user);

		// 获取setName方法
		String name = nameFiled.getName();

		String methodName = "set" + name.substring(0, 1).toUpperCase() + name.substring(1);

		// 第二个参数是这个方法的参数类型
		Method method = clazz.getDeclaredMethod(methodName, String.class);

		method.invoke(user, "tt1");

		System.out.println(user);
	}
}
