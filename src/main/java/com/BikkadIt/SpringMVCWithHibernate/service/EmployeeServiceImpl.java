package com.BikkadIt.SpringMVCWithHibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIt.SpringMVCWithHibernate.dao.EmployeeDaoI;
import com.BikkadIt.SpringMVCWithHibernate.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeServiceI{

		@Autowired
		private EmployeeDaoI employeeDaoI;

		@Override
		public int saveEmployee(Employee emp) {
			
			int id = employeeDaoI.saveEmployee(emp);
			return id;
		}

		@Override
		public List<Employee> getAllEmplyoyee() {
			List<Employee> allEmployee = employeeDaoI.getAllEmployee();
			
			return allEmployee;
		}
	
}
