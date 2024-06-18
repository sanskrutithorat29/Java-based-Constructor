package com.javaBasedConstructor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {
	@Bean
	public Employee employee() {
		return new Employee(1, "Sanskruti Thorat", "Nashik", department());
	}

	@Bean
	public Department department() {
		return new Department(101, "Developement");
	}

}
