package com.model;

public class Emp {
	private int emp_id;
	public Emp() {
		super();
	}
	public Emp(int emp_id, String emp_name) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	@Override
	public String toString() {
		return "Emp [emp_id=" + emp_id + ", emp_name=" + emp_name + "]";
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	private String emp_name;

}
