package com.sample.springbootproject.model;

import java.util.List;

public class Course {
	private String course;
	private List<String> subTopics;
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public List<String> getSubTopics() {
		return subTopics;
	}
	public void setSubTopics(List<String> subTopics) {
		this.subTopics = subTopics;
	}

}
