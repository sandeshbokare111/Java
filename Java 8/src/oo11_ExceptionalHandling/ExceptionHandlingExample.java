package oo11_ExceptionalHandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
	
		//Converting list of string to int.
	
	List<String> list = Arrays.asList("22","23","3a");
	list.stream().forEach(consumerExceptionalhandling(s->System.out.println(Integer.parseInt(s))));
	
	
	//Approach 1
//	list.stream().forEach(s->{
//		try {
//			System.out.println(Integer.parseInt(s));
//		}catch(Exception e) {
//			System.out.println(""
//					+ "Exception "+e.getMessage());
//		}
//	});
	
//	List<Integer> s = list.stream().map(a->Integer.parseInt(a)).collect(Collectors.toList());
//	System.out.println(s);
	

	//Approach 2
//	list.stream().forEach(ExceptionHandlingExample::printList);
}
//	public static void printList(String s) {
//		try {
//			System.out.println(Integer.parseInt(s));
//		}catch(Exception e) {
//			System.out.println(""
//					+ "Exception "+e.getMessage());
//		}		
//	}
	
	//Its for a single type of String.
	public static Consumer<String> consumerExceptionalhandling(Consumer<String> nums){
		return obj->{
			try {
				nums.accept(obj);
			} catch (Exception e) {
				System.out.println("Exception "+e.getMessage());
		}
	};
	}
	
	
	
}