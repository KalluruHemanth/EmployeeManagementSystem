package com.spec.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spec.entites.Employee;
import com.spec.service.EmployeeService;
@CrossOrigin("*")
@Controller
@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@RequestMapping("/employee")
	public List<Employee> getAllEmployee(){
		return service.getAllEmployee();
	}
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return service.addEmployee(employee);
	}
	@RequestMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable("id")int id) {
		return service.getEmplyeeById(id);
		
	}
	@RequestMapping(value="/employee/{id}",
			method=RequestMethod.PUT)
	public Employee updateEmployee(@PathVariable("id") int id,@RequestBody Employee employee) {
		return service.updateEmployee(id,employee);
	}
	@RequestMapping(value="/employee/{id}",
			method=RequestMethod.DELETE)	
	public void deleteEmployee (@PathVariable("id")int id) {
		 service.deleteEmployee(id);
		
	
	}
}

