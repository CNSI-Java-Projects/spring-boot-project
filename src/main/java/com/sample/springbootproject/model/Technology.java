package com.sample.springbootproject.model;

import org.springframework.stereotype.Component;

@Component
public class Technology {
	private int id;
	private String skills;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	
	public void showTechnology() {
		System.out.println("Java is popular");
	}
}