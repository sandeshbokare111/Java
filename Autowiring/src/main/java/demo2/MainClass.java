package demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("demo2/bean.xml");
		Employee employee = context.getBean("emp",Employee.class);
		Employee employee1 = context.getBean("emp",Employee.class);
		System.out.println(employee.getAdress());
		System.out.println(employee.hashCode());
		System.out.println(employee1.hashCode());
		
}
}