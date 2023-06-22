package demo4service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("demo4Service/bean.xml");
		LoginServices log=context.getBean("loginServices",LoginServices.class);
		System.out.println(log.isValidUser());
	}
}
