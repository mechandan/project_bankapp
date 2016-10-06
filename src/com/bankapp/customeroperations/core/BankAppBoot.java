package com.bankapp.customeroperations.core;

import java.util.Scanner;

import com.bankapp.customeroperations.CreateCustomer;
import com.bankapp.customeroperations.DeleteCustomer;
import com.bankapp.customeroperations.SearchCustomer;
import com.bankapp.customeroperations.impl.CreateCustomerImpl;

public class BankAppBoot {
	public static void main(String[] args) {
		while(true){

		System.out.println("***** Welcome To Bank App *****");
		System.out.println("1. New Customer");
		System.out.println("2. Search Customer");
		System.out.println("3. Delete Customer");
		System.out.println("4. Exit");
		System.out.println("Enter your Option:");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int option = Integer.parseInt(input);
		if (option>0 && option < 5) {
			switch (option) {

			case 1:
				CreateCustomer createCustomer=new CreateCustomerImpl();
				createCustomer.create();
				break;
			case 2:
				SearchCustomer searchCustomer;
				break;
			case 3:
				DeleteCustomer deleteCustomer;
				break;
			case 4:
				System.exit(0);

			}

		} else {
			System.out.println("");
		}

	}
	}

}
