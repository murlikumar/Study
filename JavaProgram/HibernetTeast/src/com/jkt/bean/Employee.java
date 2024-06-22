package com.jkt.bean;

import java.io.Serializable;

public class Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int emp_id;
	private String name;
	private String address;
	
	public Employee() {
		// TODO Auto-generated constructor stub
		super();
	}	
	
	public Employee(String address, int emp_id, String name) {
		super();
		this.address = address;
		this.emp_id = emp_id;
		this.name = name;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	public void display(){
		
		System.out.println(emp_id+" "+name+" "+address);
		
	}
		

}
