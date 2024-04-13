package com.spec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spec.entites.Employee;
import com.spec.respository.EmployeeRespositiory;
@Service
public class EmployeeService implements EmployeeServiceInterface{
	
	@Autowired
	EmployeeRespositiory repository;

	@Override
	public List<Employee> getAllEmployee() {
		return repository.findAll();
	}
    @Override
	public Employee addEmployee(Employee employee) {
		
		return repository.save(employee);
	}
	@Override
	public Employee getEmplyeeById(int id) {
		
		
		//findById(id) returns an Optional class object
		//get () method helps to read employee object from the Optional return repository. findById(id).get();
		return repository. findById(id).get();
	}
	@Override
	public Employee updateEmployee(int id,Employee emp) {
			Employee e=repository.findById(id).get();
			e.setEmpName(emp.getEmpName());
			e.setEmpSalary(emp.getEmpSalary());
			e.setMoblieNo(emp.getMoblieNo());
			e.setEmail(emp.getEmail());
			e.setAge(emp.getAge());
			e.setDepartment(emp.getDepartment());
			e.setDesignation(emp.getDesignation());
			return repository.save(e);
	}
	public void deleteEmployee(int id) {
		Employee e=repository.findById(id).get();
		int id1=e.getEmpid();
		repository.delete(e);
		System.out.println("Employee deleted"+id1);
		
	}
	
	}

