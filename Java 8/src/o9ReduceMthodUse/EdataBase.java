package o9ReduceMthodUse;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EdataBase {
	public static List<Employee> getEmployees(){
		return Stream.of(new Employee(1, "Sam", "A", 20000),
				new Employee(2, "ram", "A", 40000),
				new Employee(3, "Pham", "A", 70000),
				new Employee(4, "Soham", "A", 80000)		
				).collect(Collectors.toList());
	}

}
