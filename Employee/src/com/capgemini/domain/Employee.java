package com.capgemini.domain;

public class Employee {
	private String empName;
	private double salary;
	private String nameOfTheDept;
	private int employeeId;
	public Employee() {
		super();
		
	}
	public Employee(String empName, double salary, String nameOfTheDept, int employeeId) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.nameOfTheDept = nameOfTheDept;
		this.employeeId = employeeId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getNameOfTheDept() {
		return nameOfTheDept;
	}
	public void setNameOfTheDept(String nameOfTheDept) {
		this.nameOfTheDept = nameOfTheDept;
	}
	public int getemployeeId() {
		return employeeId;
	}
	public void setemployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	}


