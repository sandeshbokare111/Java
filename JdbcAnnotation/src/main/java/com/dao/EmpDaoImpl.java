package com.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.model.Emp;

public class EmpDaoImpl implements EmpDao{
	
	private JdbcTemplate jdbctemplate;

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
	

	public int insertEmployee(Emp emp) {
		String query = "insert into Emp values (?,?)";
		int res = this.jdbctemplate.update(query, emp.getEmp_id(), emp.getEmp_name());
		return res;
		
	}

	public int updateEmployee(Emp emp) {
		String query = "update Emp set emp_id=?,emp_name=?";
		int res = this.jdbctemplate.update(query, emp.getEmp_id(), emp.getEmp_name());
		return res;
	
	}

	public int deleteEmployee(int emp_id) {
		String query = "delete from Emp where emp_id=?";
		int res = this.jdbctemplate.update(query,emp_id);
		return res;
		
	}

	public Emp getEmp(int emp_id) {
		String query = "select * from Emp where emp_id=?";
		RowMapper<Emp> rowMapper = new RowMapperImpl();
		Emp emp = this.jdbctemplate.queryForObject(query, rowMapper,emp_id);
		return emp;
	}

	public List<Emp> getAllEmp() {
		String query = "select * from Emp";
		List<Emp> list = this.jdbctemplate.query(query, new RowMapperImpl());
		return list;
	}



}
