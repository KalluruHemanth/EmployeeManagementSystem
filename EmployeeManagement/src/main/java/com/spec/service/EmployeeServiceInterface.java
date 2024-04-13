package com.spec.service;

import java.util.List;

import com.spec.entites.Employee;

public interface EmployeeServiceInterface {
	public List<Employee> getAllEmployee();
	public Employee addEmployee(Employee employee);
	public Employee getEmplyeeById(int id);
	public Employee updateEmployee(int id,Employee emp);
	public void deleteEmployee(int id);
}
