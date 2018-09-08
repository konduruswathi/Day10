package com.capgemini.employeeapp.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.employeeapp.dao.EmployeeDao;
import com.capgemini.employeeapp.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
private List<Employee> employees=new ArrayList<>();
	@Override
	public List<Employee> findAllEmployees() {
		
		return employees;
	}

	@Override
	public Employee findEmployeeById(int employeeId) {
		for (Employee employee : employees) {
			if(employee.getEmployeeId()==employeeId) {
				return employee;
			}
		}
		return null;
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		for (Employee employee : employees) {
			if(employee.getEmployeeId()==employeeId) {
				employees.remove(employee);
			return true;
		}
		}
		return false;
	}

	@Override
	public boolean addEmployeeId(Employee employee) {
		
		return employees.add(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		for (Employee employee1 : employees) {
			if(employee1.getEmployeeId()==employee.getEmployeeId()) {
				employee1.setEmployeeName(employee.getEmployeeName());
				employee1.setEmployeeSalary(employee.getEmployeeSalary());
				employee1.setEmployeeDepartment(employee.getEmployeeDepartment());
				
			}
			return employee1;
		}
		return null;
	}



	}


