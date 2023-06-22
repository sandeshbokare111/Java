package oo10_ParallelStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import o9ReduceMthodUse.Employee;

public class EdataBase {
	public static List<Employee> getEmployees(){
		List<Employee> emp = new ArrayList<>();
		for(int i=0;i<=1000;i++) {
			emp.add(new Employee(i,"Employee "+i,"A",(new Random().nextInt(1000*100))));
		}
		return emp;
	}

}
