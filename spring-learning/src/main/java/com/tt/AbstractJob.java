package com.tt;

import org.springframework.beans.factory.FactoryBean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AbstractJob implements FactoryBean<List<String>> {
	@Override
	public List<String> getObject() throws Exception {
		return new ArrayList<>(Arrays.asList("tt", "zz"));
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}
}
