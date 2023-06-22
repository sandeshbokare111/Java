package com.dao;

import java.util.List;

import com.model.Product;


public interface ProductDao {
	public int insertProduct(Product product);
	public int updateProduct(Product product);
	public int deleteProduct(Product product);
	//get only single row
	public Product getProduct(int pid);
	//to get all employees
	public List<Product> getAllProduct();

}
