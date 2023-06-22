package o1lambdaExpressions;

import java.util.Scanner;
import java.util.function.Consumer;

@FunctionalInterface
interface Calc {

	public int switchon(int a, int b);
}

public class Calculator{
	
	public static void main(String[] args) {
		Calc c = (a,b)->a+b;
//			System.out.println("Sum is"+d);
//			return d;
//		};
		System.out.println(c.switchon(10, 20));
		
		
		Consumer<Integer> c1 = (a)->System.out.println("This is consumer"+a);
		c1.accept(1000);
	}

	
	//Traditional Approach
	
//	@Override
//	public void switchon() {
//		System.out.println("Traditional Approach");
//	}
	
//	public static void main(String[] args) {
//		Calculator c = new Calculator();
//		c.switchon();
//	}
	
	//lambda Expressions
//	public static void main(String[] args) {

//Without Argument
//		Calc c = () -> {
//			System.out.println("Hii its Lambda Expression");
//		};
//		c.switchon();
//	}
//		Calc c = (a,b) -> {
//			int d = a+b;
//			System.out.println("Sum is "+d);
//			return d;
//		};
//		c.switchon(10, 20); 
//		
////		Calc c = (a,b)->{
////			if(a>b) {
////			return a-b;	
////			}else {
////				throw new RuntimeException("First number value is less than second");
////			}
////		};
////		Scanner sc = new Scanner(System.in);
////		System.out.println("Enter first number");
////		int a = sc.nextInt();
////		System.out.println("Enter second number");
////		int b = sc.nextInt();
////		System.out.println(c.switchon(a, b));
////	}
		
}