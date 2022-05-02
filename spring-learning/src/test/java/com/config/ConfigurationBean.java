package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationBean {
	@Bean
	public Fruit fruit() {
		Fruit fruit = new Fruit();
		fruit.setName("fruit");
		return fruit;
	}

	@Bean
	public User user() {
		User user = new User(fruit());
		user.setName("tt");
		return user;
	}
}
