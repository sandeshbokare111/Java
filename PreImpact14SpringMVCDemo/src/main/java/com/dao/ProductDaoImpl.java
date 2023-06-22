package com.dao;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.model.Product;

public class ProductDaoImpl implements ProductDao {

		private JdbcTemplate jdbcTemplate;
		
		public JdbcTemplate getJdbcTemplate() {
			return jdbcTemplate;
		}

		public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}

		public int insertProduct(Product product) {
			String query = "insert into product values (?,?,?)";
			int row=this.jdbcTemplate.update(query,product.getPid(),product.getPname(),product.getPprice());
			return row;
		}

		public int updateProduct(Product product) {
			String query = "update product set pname=? where pid=?";
			int row=this.jdbcTemplate.update(query,product.getPname(),product.getPid());
			return row;
		}

		public int deleteProduct(Product product) {
			
			return 0;
		}

		public Product getProduct(int pid) {
			
			return null;
		}

		public List<Product> getAllProduct() {
			String query = "select * from product";
			List<Product> prod =this.jdbcTemplate.query(query, new RowMapperImpl());
			return prod;
		}

	}

