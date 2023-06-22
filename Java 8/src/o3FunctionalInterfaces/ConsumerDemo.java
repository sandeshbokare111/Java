package o3FunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//import o1lambdaExpressions.Calc;

public class ConsumerDemo{
	public static void main(String[] args) {
//		Consumer<Integer> c = (t)->{
//			System.out.println("printing "+ t);
//		};
//		
//		c.accept(1);
//		
//		List<Integer> list = Arrays.asList(10,20,30,40,50);
//		list.stream().forEach(c);
		
		
		Consumer<Integer> c1 = (t1)->{
			System.out.println("The"
					+ " numbers are"+t1);
		};
		
		
		List<Integer> list1 = new ArrayList<>();
		for(int i=0;i<=10;i++) {
			list1.add(i);
		}
		System.out.println(list1);
		list1.stream().forEach(c1);
	}
}