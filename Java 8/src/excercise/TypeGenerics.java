package excercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TypeGenerics<T extends Number>{
	private T a;
	private T b;
	@Override
	public String toString() {
		return "TypeGenerics [a=" + a + ", b=" + b + "]";
	}
	public TypeGenerics(T a, T b) {
		super();
		this.a = a;
		this.b = b;
	}
	
//////////////////////////////////////
	public Double add() {
		return a.doubleValue()+b.doubleValue();	
	}
	
	public Double sub() {
		return (double) (add().intValue()-b.intValue());	
	}
	
	public static void main(String[] args) {
//		TypeGenerics<Integer> value = new TypeGenerics<Integer>(10, 20);
//		System.out.println(value.add());
//		System.out.println(value.sub());
		Map<Integer, String> map = new HashMap<>();
		map.put(1,"Sandesh");
		map.put(2,"Sidray");
		map.put(3,"Manvith");
		
	   for(	Map.Entry<Integer,String> entry : map.entrySet()) {
		   System.out.println("Key : "+entry.getKey()+" "
				   			  +"Value:"+entry.getValue());
	   }
	   
	   Iterator<Map.Entry<Integer,String>> itr = map.entrySet().iterator();
	   
	   System.out.println("By using the Iterator");
	   while(itr.hasNext()) {
		   Map.Entry<Integer, String> entry = itr.next();
		   System.out.println("Key : "+entry.getKey()+" "
		   			  +"Value:"+entry.getValue());
	   }
	}
}