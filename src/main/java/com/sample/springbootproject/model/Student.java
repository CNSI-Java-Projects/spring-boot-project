package com.sample.springbootproject.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	private int id;
	private String name;
	private String technology;
	@Autowired
	private Technology tech;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	public void show() {
		System.out.println("It is showing");
		tech.showTechnology();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", technology=" + technology + "]";
	}

	
	
}
