package o8ExampleOfMapAndFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {
	public static List<Customer> getAll() {
		return Stream
				.of(new Customer(101, "Sandesh", "sandesh@gmail.com", Arrays.asList("123456764", "4531566232")),
						new Customer(102, "Soham", "soham@gmail.com", Arrays.asList("98527183", "81566232")),
						new Customer(103, "Anil", "anil@gmail.com", Arrays.asList("93205435", "31566232")),
						new Customer(104, "Mahesh", "mahesh@gmail.com", Arrays.asList("13456764", "531566232")))
				.collect(Collectors.toList());
	}
}