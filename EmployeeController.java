package com.tricon.demoSpring.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@RequestMapping(value="/emp",method=RequestMethod.GET)
	public List<Employee>getEmployee(){
		List<Employee>empList=new ArrayList<>();
		
		
		Employee emp1 =new Employee(1,"first",10000);
		Employee emp2 = new Employee(1,"second",30000);

	empList.add(emp1);
	empList.add(emp2);
	return empList;

	}
}

