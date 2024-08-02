package com.revature.emp;

public abstract class Employee {
	private int emiId;
	private String name;
	private int salary;
	
	public Employee(int emiId, String name, int salary) {
		super();
		this.emiId = emiId;
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public int getEmiId() {
		return emiId;
	}

	public void setEmiId(int emiId) {
		this.emiId = emiId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public abstract double calculateSalary();
	
	@Override
	public String toString() {
		return "Employee ID: " + emiId + ", Name: " + name + ", Salary: " + salary;
	}
	
}
