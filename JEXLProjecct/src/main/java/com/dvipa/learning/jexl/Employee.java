package com.dvipa.learning.jexl;

public class Employee {
	private String name;
	Integer salary;

	public Employee(String name, Integer salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getLengthOfName() {
		return name.length();
	}

}
