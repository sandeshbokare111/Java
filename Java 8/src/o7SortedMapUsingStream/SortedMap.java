package o7SortedMapUsingStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import o5miniProject.Employee;

public class SortedMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Sandy", 5);
		map.put("Tom", 4);
		map.put("Dev", 3);
		map.put("Maddy", 2);
		map.put("Kate", 1);

		// Traditional Approach
//	List<Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());
//	Collections.sort(entries,(o1,o2)->o1.getKey().compareTo(o2.getKey()));
//	System.out.println(entries);

//By Stream API...
///*1st By obj*/	map.entrySet().stream().sorted((o1,o2)->o2.getKey().compareTo(o1.getKey())).forEach(t->System.out.println(t));;
///*2nd by key*/ map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
//System.out.println("===========================================================");
///*3rd by value*/map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

//By Employee object Sorting using map...

		Map<Employee, Integer> employeeMap = new TreeMap<>((o1, o2) -> o2.getId() - (o1.getId()));
		employeeMap.put(new Employee(100, "Rahul", "IT", 16000), 60);
		employeeMap.put(new Employee(101, "Sandesh", "ECE", 6000), 80);
		employeeMap.put(new Employee(102, "Bharat", "EEE", 13000), 90);
		employeeMap.put(new Employee(103, "yatish", "ME", 12000), 10);
		employeeMap.put(new Employee(104, "Chandru", "CSE", 26000), 40);

		System.out.println(employeeMap);

// Using Stream API.
		employeeMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
				.forEach(System.out::println);		
	}
}
