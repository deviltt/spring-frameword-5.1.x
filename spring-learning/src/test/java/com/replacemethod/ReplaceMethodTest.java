package com.replacemethod;

import com.tt.replacemethod.MyMethod;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReplaceMethodTest {
	@Test
	public void test1() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("replace-method.xml");

		MyMethod myMethod = (MyMethod) context.getBean("myMethod");

		myMethod.display();

	}
}
