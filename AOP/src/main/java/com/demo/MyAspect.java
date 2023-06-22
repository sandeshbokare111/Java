package com.demo;

import java.util.Scanner;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	Scanner input = new Scanner(System.in);
	@Before("execution(* com.demo.PaymentServiceImpl.paymentservice())")
	public void printBefore() {
		System.out.println("Enter User Name: ");
		String username = input.next();
		System.out.println("Enter Password : ");
		String password = input.next();
		
		if(username.equals("admin")&&password.equals("admin")) {
			System.out.println("Valid User");
		}else {
			System.out.println("Invalid User");
		}
	}
	
	@After("execution(* com.demo.PaymentServiceImpl.paymentservice())")
	public void printAfter() {
		System.out.println("Transcation complete successfully....");
		
	}
	

}