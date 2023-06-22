package o5miniProject;

import java.util.ArrayList;
import java.util.List;

public class EmpDao {
	public static List<Employee> getEmployee(){
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(100,"Sandesh","IT",16000));
		list.add(new Employee(101,"Rahul","Core",22000));
		list.add(new Employee(102,"Kiran","MIT",12000));
		list.add(new Employee(103,"Raju","NIT",80000));
		list.add(new Employee(104,"Aman","DIT",9000));
		return list;
	}

}
