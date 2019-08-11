package com.tricon.demoSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tricon.demoSpring.model.Employee;
import com.tricon.demoSpring.service.EmployeeService;

@RestController
@RequestMapping(value= "/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeService es ;
	
	@RequestMapping(value = "/{id}" , method = RequestMethod.GET)
	public Employee getEmployee(@PathVariable(name = "id") int emp_id) {
		
		return es.getEmployee(emp_id);
		
	}
	
	@RequestMapping(value = "" , method = RequestMethod.GET)
	public List<Employee> getAllEmployees() {
		
		return es.getAllEmployees();
		
	}
	
	
	@RequestMapping(value = "" , method = RequestMethod.POST)
	public String addEmployee(@RequestBody Employee emp) {
		
		//Write code to add into the db
		return emp.toString();
	}

	
	
}
