package com.tt;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
	private String name;

	@Autowired
	private Fruit fruit;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Fruit getFruit() {
		return fruit;
	}

	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", fruit=" + fruit +
				'}';
	}
}
