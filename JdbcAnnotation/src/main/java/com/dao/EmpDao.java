package com.dao;

import java.util.List;

import com.model.Emp;

public interface EmpDao {
	public int insertEmployee(Emp emp);
	
	public int updateEmployee(Emp emp);
	
	public int deleteEmployee(int emp_id);
	
	public Emp getEmp(int emp_id);
	
	public List<Emp> getAllEmp();
}
