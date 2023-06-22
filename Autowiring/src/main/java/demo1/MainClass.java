package demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("demo1/bean.xml");
		Employee employee = context.getBean("emp",Employee.class);
		System.out.println(employee.toString());
		
		

}

	}

