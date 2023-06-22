package o3FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//import java.util.function.Predicate;

public class PredicateDemo{

//public class PredicateDemo implements Predicate<Integer>{
//
//	@Override
//	public boolean test(Integer t) {
//		if(t<10) {
//		return true;
//	}else {
//		return false;
//		}
//	}
//	
//	public static void main(String[] args) {
//		PredicateDemo prd = new PredicateDemo();
//		System.out.println(prd.test(20));
//	}

	
	public static void main(String[] args) {
//		Predicate<Integer> prd = t->t<30;
//		System.out.println(prd.test(12));
			
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		list.stream().filter(t->t%2==0).forEach(t->System.out.println("Print Even number "+ t));
		}
	
	}