package com.tricon.demoSpring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.tricon.demoSpring.model.Employee;


@Repository
public class EmployeeDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public Employee getEmployee(int id) {
		
		Employee emp =jdbcTemplate.queryForObject("SELECT * FROM employees WHERE emp_id= ?" , new Object[] {id} , 
				(rs,rowNum) -> new Employee(rs.getInt("emp_id"),rs.getString("name"),rs.getString("position"),rs.getDouble("salary")));
		
		return emp;
		
	}
	
	public List<Employee> getAllEmployees(){
		
		List<Employee> employees=jdbcTemplate.query("SELECT * FROM employees", new RowMapper<Employee>() {
			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee emp = new Employee();
			    emp.setId(rs.getInt("emp_id"));
			    emp.setName(rs.getString("name"));
			    emp.setPosition(rs.getString("position"));
			    emp.setSalary(rs.getDouble("salary"));
				return emp;
			}
		});
		
		return employees;
		
	}

}
