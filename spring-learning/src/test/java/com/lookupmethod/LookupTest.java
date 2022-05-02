package com.lookupmethod;

import com.tt.lookupmethod.FruitPlate;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LookupTest {
	@Test
	public void test1() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lookup-method.xml");

		FruitPlate fruitPlate1 = (FruitPlate) context.getBean("fruitPlate1");
		FruitPlate fruitPlate2 = (FruitPlate) context.getBean("fruitPlate2");

		System.out.println(fruitPlate1.getFruit());
		System.out.println(fruitPlate1.getFruit());
		System.out.println(fruitPlate2.getFruit());
	}
}
