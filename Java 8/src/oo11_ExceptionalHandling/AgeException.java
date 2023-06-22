package oo11_ExceptionalHandling;

public class AgeException {

	int age = 18;

	public static boolean validate(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age should not be less than 18");
		}
		return true;
	}
	public static void main(String[] args) throws InvalidAgeException {
		AgeException s = new AgeException();
		System.out.print(s.validate(16));
	}

}