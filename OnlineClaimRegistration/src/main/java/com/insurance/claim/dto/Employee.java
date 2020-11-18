package com.insurance.claim.dto;

public class Employee {
	private int empcode;
	private String empname;
	private double salary;
	private String doj;
	
	public Employee(int i, String string, double j, String string2){
		
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEmpcode() {
		return empcode;
	}

	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}
	
}
