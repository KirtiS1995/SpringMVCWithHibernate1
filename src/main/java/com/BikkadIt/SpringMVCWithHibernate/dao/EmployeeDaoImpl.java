package com.BikkadIt.SpringMVCWithHibernate.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.BikkadIt.SpringMVCWithHibernate.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDaoI{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public int saveEmployee(Employee emp) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		int save = (int) session.save(emp);

		session.getTransaction().commit();

		return save;
	}


	@Override
	public List<Employee> getAllEmployee() {
		Session session = sessionFactory.openSession();
	String query="from Employee";
	Query que = session.createQuery(query);
	List<Employee> list = que.getResultList();
	return list;
	}

}
