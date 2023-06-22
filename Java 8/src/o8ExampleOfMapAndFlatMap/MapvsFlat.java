package o8ExampleOfMapAndFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapvsFlat {
	public static void main(String[] args) {
		List<Customer> customers = EkartDataBase.getAll();

//Converting list<customer> to List<String> it is called as data transformation
//mapping : customer -> customer.getEmail
//Customer -> customer.getEmail  One to One Mapping.
		List<String> emails = customers.stream()
				.map(c -> c.getEmail())
				.collect(Collectors.toList());
		System.out.println(emails);

		System.out.println("===========================================");

//Customer-> c.getPhonenumbers -> one to many mapping.

		// It will print nested phone numbers [[98527183, 81566232], [93205435,
		// 31566232], [13456764, 531566232]]
		List<List<String>> phoneNumbers = customers.stream()
				.map(c -> c.getPhonenumbers()).
				collect(Collectors.toList());
		System.out.println(phoneNumbers);

		//It will print all the data in the single list
		
		//Converting list<customer> to List<String> it is called as data transformation
		//mapping : customer -> customer.getPhonenumbers
		//Customer-> c.getPhonenumbers -> one to many mapping.
		List<String> flatphoneNumber = customers.stream()
				.flatMap(c -> c.getPhonenumbers().stream())
				.collect(Collectors.toList());
		System.out.println(flatphoneNumber);

	}

}
