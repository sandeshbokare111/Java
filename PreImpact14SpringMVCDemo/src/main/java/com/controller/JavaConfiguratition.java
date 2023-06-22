package com.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.dao.ProductDao;
import com.dao.ProductDaoImpl;

@Configuration

public class JavaConfiguratition {

		
		@Bean(name={"ds"})
		public DriverManagerDataSource getDataSource() {
			DriverManagerDataSource ds = new DriverManagerDataSource();
			ds.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			ds.setUrl("jdbc:sqlserver://localhost;databaseName=Citiustech;instanceName=SQLEXPRESS2019");
			ds.setUsername("sa");
			ds.setPassword("_123");
			return ds;	
		}
		
		@Bean(name={"jdbcTemplate"})
		public JdbcTemplate getTemplate() {
			JdbcTemplate jbcTemplate = new JdbcTemplate();
			jbcTemplate.setDataSource(getDataSource());
			return jbcTemplate;
		}
		
		@Bean(name={"pDao"})
		public ProductDao getProductDao() {
			ProductDaoImpl pDao = new ProductDaoImpl();
			pDao.setJdbcTemplate(getTemplate());
			return pDao;
		}




}