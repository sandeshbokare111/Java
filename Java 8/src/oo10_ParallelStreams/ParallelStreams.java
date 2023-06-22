package oo10_ParallelStreams;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

import o9ReduceMthodUse.Employee;

public class ParallelStreams {

	public static void main(String[] args) {
		long start = 0;
		long end = 0;
		start =  System.currentTimeMillis();
		IntStream.range(0, 100).forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("plain stream took time to run program "+(end-start));
		
		System.out.println("///////////////////////////////////////////////////////////////////////////");
		
		start =  System.currentTimeMillis();
		IntStream.range(0, 100).parallel().forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("parallel stream took time to run program "+(end-start));
		
		IntStream.range(1, 10).forEach(x->{
			System.out.println("Thread : "+Thread.currentThread().getName()+" : "+x);
		});
		
		IntStream.range(1, 10).parallel().forEach(x->{
			System.out.println("Thread : "+Thread.currentThread().getName()+" : "+x);
		});

		List<Employee> list = EdataBase.getEmployees();
		
		start = System.currentTimeMillis();
		Double sal = list.stream().map(Employee::getSalary).mapToInt(i->i).average().getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("normal execution "+sal+" execution time : "+(end-start));
		
		start = System.currentTimeMillis();
		Double avg = list.parallelStream().map(Employee::getSalary).mapToInt(i->i).average().getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("Parallel stream execution "+sal+ " execution time : "+(end-start));
	}
}
