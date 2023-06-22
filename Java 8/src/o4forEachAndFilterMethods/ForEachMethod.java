package o4forEachAndFilterMethods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ForEachMethod {
	public static void main(String[] args) {
		List<String> listOfStudents = new ArrayList<>();
		listOfStudents.add("Sandesh");
		listOfStudents.add("Pradeep");
		listOfStudents.add("Aman");
		listOfStudents.add("Bharat");
		listOfStudents.add("Sagar");
		listOfStudents.add("Mahesh");
		for(String s:listOfStudents) {
//			System.out.println(s);
//			if(s.startsWith("S"))
//			System.out.println(s);
		}
		
		listOfStudents.stream().filter((t)->t.startsWith("M")).forEach(t->System.out.println(t));
		
		listOfStudents.stream().filter((t)->t.startsWith("S")).forEach(s->System.out.println(s));
		
//		listOfStudents.stream().forEach(t->System.out.println("\n"+t));
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "java");
		map.put(2, "python");
		map.put(3, "C++");
		map.put(4, "Agular");
		
//		map.forEach((key,value)->System.out.println(key+" : "+value));
//		map.entrySet().stream().forEach(obj->System.out.println(obj));
		map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj->System.out.println(obj));
		map.entrySet().stream().filter(s->s.getKey()%2!=0).forEach(j->System.out.println(j));
	 }
}
