package o5miniProject;

import java.util.List;
import java.util.stream.Collectors;

public class ServiceEmployee {

	public static List<Employee> evaluatetaxUsers(String input) {
		return (input.equalsIgnoreCase("tax"))
				? EmpDao.getEmployee().stream().filter(emp -> emp.getSalary() > 15000).collect(Collectors.toList())
				:

				EmpDao.getEmployee().stream().filter(emp -> emp.getSalary() < 15000).collect(Collectors.toList());

	}

	public static void main(String[] args) {
		System.out.println(evaluatetaxUsers("nontax"));
	}  
}
