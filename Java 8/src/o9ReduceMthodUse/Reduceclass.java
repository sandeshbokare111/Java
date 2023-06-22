package o9ReduceMthodUse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import o8ExampleOfMapAndFlatMap.EkartDataBase;

public class Reduceclass {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,4,3,3,5,3,2,9);
		
		List<String> words = Arrays.asList("Sandesh","India","Dsatm","Shedbal","Bangalore");
		
		int sum = num.stream().mapToInt(i->i).sum();
		System.out.println(sum);
		
		int numreduce = num.stream().reduce(0,(a,b)->a+b);
		System.out.println("reduced sum "+numreduce);
		
		Optional<Integer> methodSum = num.stream().reduce(Integer::sum);
		System.out.println("Methods sum is "+methodSum.get());
		
		int  maxValue = num.stream().reduce(0,(a,b)->a>b?a:b);
		System.out.println("Max value is "+maxValue);
		
		int minvalue = num.stream().reduce(Integer::min).get();
		System.out.println("min values is "+minvalue);
		
		String maxlen = words.stream().reduce((a,b)->a.length()>b.length()?a:b).get();
		System.out.println(maxlen);
		
		
		///Employee 
		
		//get employee whose grade is A
		List<Employee> emp = EdataBase.getEmployees();
		
		Double s = emp.stream().
		filter(e->e.getGrade().equalsIgnoreCase("A"))
		.map(e->e.getSalary())
		.mapToInt(i->i)
		.average().getAsDouble();
		;
		System.out.println(s);
	}

}
