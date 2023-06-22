package o3FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

//import java.util.function.Supplier;

public class SupplierDemo{

//	@Override
//	public Integer get() {
//		return 20;
//	}
//	
//	public static void main(String[] args) {
//		SupplierDemo sp = new SupplierDemo();
//		System.out.println(sp.get());
//	}

	public static void main(String[] args) {
//		Supplier<String> splr = ()->{
//			return "sandesh";
//		};
		List<String> list = Arrays.asList();
//		System.out.println(list.stream().findAny().orElseGet(splr));
		System.out.println(list.stream().findAny().orElseGet(()->"sandesh"));
	}
}
