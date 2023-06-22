package demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("demo3/bean.xml");
		Employee emp = context.getBean("employee",Employee.class);
		System.out.println(emp.getEmpAddress());
	}

}
