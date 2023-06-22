package com.view;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.EmpDaoImpl;
import com.entities.JavaConfiguratition;
import com.model.Emp;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguratition.class);
		EmpDaoImpl emp = context.getBean("empDao",EmpDaoImpl.class);
		Emp e1 = new Emp();
		e1.setEmp_id(11);
		e1.setEmp_name("Sidray");
		int res = emp.insertEmployee(e1);
		System.out.println(res+" row inserted....");
//		
//		Emp e2 = new Emp();
//		e2.setEmp_id(100);
//		e2.setEmp_name("Sandesh");
//		int res1 = emp.updateEmployee(e2);
//		System.out.println(res1+" updated....");
//		
//		Emp e3 = new Emp();
//		int res2 = emp.deleteEmployee(12);
////		System.out.println(res2+" deleted....");
		
//---------------------------------------By id--------------------------------------
//		Emp e4 = new Emp();
//		emp.getEmp(100);
//		System.out.println(e4);
		
//----------------------------------------------------------------------------------
		
//		List<Emp> list = emp.getAllEmp();
//		System.out.println(list);
//		for(Emp l:list) {
//			System.out.println(l.getEmp_id());
//			System.out.println(l.getEmp_name());
//		}
	}

}
