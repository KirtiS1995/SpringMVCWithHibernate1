package com.BikkadIt.SpringMVCWithHibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYE_DETLS")
public class Employee {

	@Column(name="EMP_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empNo;
	
	@Column(name="EMP_NAME")
	private String empName;
	
	@Column(name="EMP_ADDR")
	private String empAddr;
	
	@Column(name="EMP_EMAIL")
	private String empEmail;

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddr() {
		return empAddr;
	}

	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empAddr=" + empAddr + ", empEmail=" + empEmail
				+ "]";
	}
	
		
		
}
