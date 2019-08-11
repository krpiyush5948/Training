package com.tricon.demoSpring.model;

public class Employee {
	private int id;
	private String name;
	private String position;
	private double salary;

	// standard constructor, getters, setters
	
	

	public int getId() {
		return id;
	}

	public Employee(int id, String name, String position, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	public Employee() {
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
