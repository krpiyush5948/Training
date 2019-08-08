package com.tricon.demoSpring.controller;

public class Employee {
	int id;
    String name;
    int salary;
  
  Employee(int id,String name,int salary){
	  this.id=id;
	  this.name=name;
	  this.salary=salary;
  }
  public int  getId() {
	  return id;
  }
  public void setId(int empid)
  {
	  this.id=empid;
  }
  public String getName() {
	  return name;
  }
  public void setName(String empname) {
	  this.name=empname;
  }
  public int getSalary() {
	  return salary;
  }
  public void getSalary(int salary) {
	  this.salary=salary;
  }
}
