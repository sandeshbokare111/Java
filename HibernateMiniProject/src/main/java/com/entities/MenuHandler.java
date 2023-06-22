package com.entities;

import java.util.Scanner;

import com.controller.CustomerController;

public class MenuHandler {
	public void DisplayAdminOperation() {
		System.out.println("---Admin Operations---");
		String[] operations = { "1. Add Customer’s data", "2. Update Customer’s Data",
				"3. Delete Customer’s information using id", "4. Display all customer’s information",
				"5. Display Single Customer’s information by providing customer id." };
		for (String i : operations) {
			System.out.println(i);
		}
	}

	public int choiceForAdmin() {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your choice: ");
				int choice = sc.nextInt();
				return choice;
			}

	public void admin_handleMenu() {
				CustomerController con = new CustomerController();
				while (true) {
					this.DisplayAdminOperation();
					int a_choice = this.choiceForAdmin();

					switch (a_choice) {
					case 1:
						con.addCustomer();
						break;
					case 2:
						con.updateCustomer();
						break;
					case 3:
						con.deleteCustomer();
					case 4:
						con.listOperation();
						break;
					case 5:
						con.listOperationById();
	 }
}
	}
}