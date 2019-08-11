package com.tricon.demoSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tricon.demoSpring.dao.EmployeeDao;
import com.tricon.demoSpring.model.Employee;


@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;
	
	public Employee getEmployee(int emp_id) {
		
		Employee emp=employeeDao.getEmployee(emp_id);
		return emp;
		
	}
	
	public List<Employee> getAllEmployees(){
		
		return employeeDao.getAllEmployees();
	}

}
