package com.tt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Fruit {
	private String name;

	private String desc;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Fruit{" +
				"name='" + name + '\'' +
				", desc='" + desc + '\'' +
				'}';
	}
}
