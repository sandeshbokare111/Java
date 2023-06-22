package com.dao;

import org.hibernate.cfg.Configuration;

public class Dao {
	public static Configuration getCustomerObj() {
        Configuration con = new Configuration();
        con.configure();
        return con;
    }
}