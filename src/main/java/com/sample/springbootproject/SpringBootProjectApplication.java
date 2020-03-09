package com.sample.springbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
		System.out.println("Application has started");
		
		/*
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootProjectApplication.class, args);
		Student obj = context.getBean(Student.class);
		obj.show();
		obj.setId(10);
		obj.setName("Vishnu");
		obj.setTechnology("Java");
		System.out.println(obj.getId());
		System.out.println(obj.getName());
		System.out.println(obj.getTechnology());
		*/
	}
	
}
