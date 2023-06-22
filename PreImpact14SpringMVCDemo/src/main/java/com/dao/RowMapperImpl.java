package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.model.Product;

public class RowMapperImpl  implements RowMapper<Product> {

	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Product prod = new Product();
		prod.setPid(rs.getInt(1));
		prod.setPname(rs.getString(2));
		prod.setPprice(rs.getFloat(3));
		return prod;
		
	}

}
