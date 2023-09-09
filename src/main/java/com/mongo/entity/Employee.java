package com.mongo.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "employee")
public class Employee {

	private Long id;
	private String name;
	private int age;
	private String department;
	
	public Employee() {	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


}
