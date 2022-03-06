package com.tt;

import org.springframework.beans.factory.FactoryBean;

import java.util.ArrayList;
import java.util.List;

public class FactoryBeanTest implements FactoryBean<List<Integer>> {
	private String ids;

	@Override
	public List<Integer> getObject() throws Exception {
		List<Integer> list = new ArrayList<>();
		String[] split = ids.split(",");
		for (String s : split) {
			list.add(Integer.valueOf(s));
		}
		return list;
	}

	@Override
	public Class<?> getObjectType() {
		return List.class;
	}

	@Override
	public String toString() {
		return "haha";
	}

	public void setIds(String ids) {
		this.ids = ids;
	}
}
