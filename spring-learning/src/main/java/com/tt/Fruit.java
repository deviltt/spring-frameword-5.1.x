package com.tt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Fruit {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fruit{" +
				"name='" + name + '\'' +
				'}';
	}
}
