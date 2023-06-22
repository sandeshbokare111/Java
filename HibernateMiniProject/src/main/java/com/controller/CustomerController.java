package com.controller;


import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.dao.Dao;
import com.entities.Customer;



public class CustomerController {
	static Configuration conf = Dao.getCustomerObj();
	static Customer c = new Customer();

    public void addCustomer() {
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tran = session.beginTransaction();

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your name : ");
        String Customer_name = sc.next();

        System.out.println("enter your address : ");
        String Customer_address = sc.next();

        System.out.println("enter your gender : ");
        String Customer_gender = sc.next();

        System.out.println("enter your age : ");
        int Customer_age = sc.nextInt();

        System.out.println("enter your phone : ");
        int Customer_phone = sc.nextInt();

        System.out.println("enter your email : ");
        String Customer_email = sc.next();

        
        c.setName(Customer_name);
        c.setGender(Customer_gender);
        c.setAge(Customer_age);
        c.setAddress(Customer_address);
        c.setPhone(Customer_phone);
        c.setEmail(Customer_email);

        session.save(c);
        tran.commit();

        System.out.println("Customer Added Successfully...");
    }
    
    public static void updateCustomer() {
        SessionFactory sf=conf.buildSessionFactory();
        Session session=sf.openSession();
        Transaction trans=session.beginTransaction();

        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter your id : ");
        int Cust_id = sc.nextInt();

        System.out.println("enter your name : ");
        String Cust_name = sc.next();
        
        System.out.println("enter your gender : ");
        String gender = sc.next();
        
        System.out.println("enter your age : ");
        int age = sc.nextInt();

        System.out.println("enter your address : ");
        String address = sc.next();

      
        System.out.println("enter your phone : ");
        int phone = sc.nextInt();

        System.out.println("enter your email : ");
        String email = sc.next();

        
        //update Customer set cust_name=:n where cust_id=1;;
        Query q = session.createQuery("update Customer set Cust_name =:n,gender=:n1,age=:n2,address=:n3,"
        		+ "phone=:n4,email=:n5 where Cust_id=:i");
        q.setParameter("n",Cust_name );
        q.setParameter("n1",gender );
        q.setParameter("n2",age );
        q.setParameter("n3",address );
        q.setParameter("n4",phone );
        q.setParameter("n5",email );
        q.setParameter("i",Cust_id );

        

        int status=q.executeUpdate();
        System.out.println(status+"rows updated");
        trans.commit();

    }
    
    public static void deleteCustomer() {

        SessionFactory sf=conf.buildSessionFactory();
        Session session=sf.openSession();
        Transaction trans=session.beginTransaction();

        Scanner input=new Scanner(System.in);

        System.out.println("enter id to delete:");
        int cust_id=input.nextInt();


        //update Customer set cust_name=:n where cust_id=1;;
        Query q = session.createQuery("delete from Customer where cust_id=:i");
        q.setParameter("i",cust_id);

        int status=q.executeUpdate();
        System.out.println(status+"rows updated");
        trans.commit();

    }
    
    public static void listOperation() {
    	SessionFactory sf = conf.buildSessionFactory();
    	Session session = sf.openSession();
    	//select * from Table name
    	//from customer
    	
    	
    	
    	TypedQuery query = session.createQuery("from Customer");
    	List<Customer> list = query.getResultList();
    	System.out.println(list);
    	Iterator<Customer> itr = list.iterator();
    	while(itr.hasNext()) {
    		Customer cst = itr.next();
//    		System.out.println("Name = "+cst.getName()+" Adress = "+cst.getAddress()+
//    				" Gender = "+cst.getGender()+" Email "+cst.getEmail()+" Phone "+cst.getPhone());
    		System.out.println(cst.toString());
    	}
    }
    
    public static void listOperationById() {
    	SessionFactory sf = conf.buildSessionFactory();
    	Session session = sf.openSession();
    	
    	Scanner input=new Scanner(System.in);

        System.out.println("enter id to get details :");
        int cust_id=input.nextInt();
    		
    	TypedQuery query = session.createQuery("from Customer where cust_id=:i");
    	query.setParameter("i",cust_id );
    	List<Customer> list = query.getResultList();
//    	Iterator<Customer> itr = list.iterator();
//    	Customer cst = itr.next();
//    	System.out.println(cst);
    	for (Customer c:list) {
    		System.out.println(c);
			
		}
    }   
}