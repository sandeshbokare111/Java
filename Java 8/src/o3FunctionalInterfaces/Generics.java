package o3FunctionalInterfaces;

public class Generics<T extends Object> {
	T num1;
	T num2;
	
	public double add(T a, T b) {
		return ((Number) a).doubleValue()+((Number) b).doubleValue();
	}
	
	
	public static void main(String[] args) {
		Generics<Number> s = new Generics<>();
		System.out.println(s.add(12,20.0f));
	}

}
