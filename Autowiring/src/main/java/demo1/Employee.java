package demo1;

public class Employee {
	private Address address;

	public Address getAdress() {
		return address;
	}

	public void setAdress(Address adress) {
		this.address = adress;
	}

	@Override
	public String toString() {
		return "Employee [adress=" + address + "]";
	}

	public Employee(Address adress) {
		super();
		this.address = adress;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
