package com.BikkadIt.SpringMVCWithHibernate.service;

import java.util.List;

import com.BikkadIt.SpringMVCWithHibernate.model.Employee;

public interface EmployeeServiceI {

	public int saveEmployee(Employee emp);
	
	public List<Employee> getAllEmplyoyee();
}
