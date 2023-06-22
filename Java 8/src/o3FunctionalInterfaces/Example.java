package o3FunctionalInterfaces;

public class Example {

	public static void main(String[] args) {
		String str = "Welcome to Citiustech";
		str.toLowerCase();
		int c = 0;
		for (int i = 0; i < str.length(); i++) {
			
			 if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
		                || str.charAt(i) == 'i'
		                || str.charAt(i) == 'o'
		                || str.charAt(i) == 'u') {
				 c++;
			 }
			
		}
		System.out.println("Count "+c);
	}
}
