package com.app2;

import org.springframework.beans.factory.FactoryBean;

import java.util.ArrayList;
import java.util.List;

public class Person implements FactoryBean<List<String>> {
	@Override
	public List<String> getObject() throws Exception {
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		return list;
	}

	@Override
	public Class<?> getObjectType() {
		return List.class;
	}
}
