package o6SortedListUsingStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import o5miniProject.EmpDao;
import o5miniProject.Employee;

public class SortList {
	public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	list.add(21);
	list.add(40);
	list.add(60);
	list.add(70);
	list.add(52);
	list.add(15);
	
	System.out.println("list of elements : "+ list);
	
//	Collections.sort(list);
//  Collections.reverse(list);
//	System.out.println(list);

	//Using Stream Api	
	
    //System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
	
	//based on condition of the Employee class using comparator.
	
	
	
	
	List<Employee> empList = EmpDao.getEmployee();
//	Collections.sort(empList, new Comparator<Employee>() {
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return (int) (o2.getSalary()-o1.getSalary());	 
//			}
//			
//	});
	
	
	Collections.sort(empList, (o1,o2)->(int) (o1.getSalary()-o2.getSalary()));
	System.out.println(empList);
	
//Using the stream api
	 
//	empList.stream().sorted(Comparator.comparing((o1,o2)->(int) (o2.getSalary()-o1.getSalary())).forEach(t->System.out.println(t));
	
	empList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(t->System.out.println(t));
	}
}

//class Mycomparator implements Comparator<Employee>{
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		return (int) (o1.getSalary()-o2.getSalary());	 
//	}
//	
//}
