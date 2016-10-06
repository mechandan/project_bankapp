package com.bankapp.customeroperations.impl;

import java.util.Scanner;

import com.bankapp.customerdao.CustomerDao;
import com.bankapp.customerdao.impl.CustomerDaoImpl;
import com.bankapp.customeroperations.CreateCustomer;
import com.bankapp.model.Address;
import com.bankapp.model.Customer;
import com.bankapp.model.Product;

public class CreateCustomerImpl implements CreateCustomer {
	private Scanner scanner = new Scanner(System.in);
	private Address address = new Address();
	private Product product = new Product();
	private Customer customer = new Customer();
	CustomerDao dao=new CustomerDaoImpl();
	
	public void create() {
		System.out.println("Enter first name: ");
		String firstName = scanner.nextLine();
		System.out.println("Enter last Name: ");
		String lastName = scanner.nextLine();
		System.out.println("Enter dob: ");
		String dob = scanner.nextLine();
		System.out.println("Enter Contact no: ");
		String contactNo = scanner.nextLine();
		System.out.println("Enter email: ");
		String email = scanner.nextLine();

		if(null != firstName && !"".equals(firstName)){
			customer.setFirstName(firstName);
		}
		else
			System.out.println("enter valid name");
		if(null != lastName && !"".equals(lastName)){
			customer.setLastName(lastName);
		}
		else
			System.out.println("enter valid name");
		if(null != dob && !"".equals(dob)){
			customer.setDob(dob);
		}
		else{
			System.out.println("enter valid dob");
		}
		
		if(null != contactNo && !"".equals(contactNo)){
			customer.setContactNo(contactNo);
		}
		else{
			System.out.println("enter valid contact number");
		}
		
		
		if(null != email && !"".equals(email)){
			customer.setEmail(email);
		}
		else{
			System.out.println("enter valid email");
		}
		
		
		
		
		
		// address
		System.out.println("Enter correspondence address: ");
		Address correspondenceAddress= populateAddress();
		if(null != correspondenceAddress){
			customer.setCorrespondenceAddress(correspondenceAddress);	
		}else
		{
			System.out.println("enter valid address");
		}
		System.out.println("Enter permanent address: ");
		Address permanentAddress= populateAddress();
		if(null != permanentAddress){
			customer.setPermanentAddress(permanentAddress);
		}else
		{
			System.out.println("enter valid address");
		}
		

		// product
		System.out.println("Enter product Id: ");
		String prodId = scanner.nextLine();
		System.out.println("Enter product description: ");
		String desc = scanner.nextLine();
		if(null!=prodId && !"".equals(prodId)){
			product.setProdId(prodId);
		}else
		{
			System.out.println("enter valid product id");
		}
		
		if(null!=desc && !"".equals(desc)){
			product.setDesc(desc);
		}else
		{
			System.out.println("enter valid description");
		}
		customer.setProduct(product);		

		dao.createCustomer(customer);
		System.out.println("account created !!!!!!");
		
	}

	/**
	 * 
	 */
	public Address populateAddress() {
		
		System.out.println("Enter line1: ");
		String line1 = scanner.nextLine();
		System.out.println("Enter line2: ");
		String line2 = scanner.nextLine();
		System.out.println("Enter city: ");
		String city = scanner.nextLine();
		System.out.println("Enter state: ");
		String state = scanner.nextLine();
		System.out.println("Enter country: ");
		String country = scanner.nextLine();
		System.out.println("Enter postcode: ");
		String postcode = scanner.nextLine();
		
		if(null!=line1 && !"".equals(line1)){
			address.setLine1(line1);
		}else
		{
			System.out.println("enter valid address");
		}
		
		if(null!=line2 && !"".equals(line2)){
			address.setLine2(line2);
		}else
		{
			System.out.println("enter valid address");
		}
		
		if(null!=city && !"".equals(city)){
			address.setCity(city);
		}else
		{
			System.out.println("enter valid city name");
		}
		
		if(null!=state && !"".equals(state)){
			address.setState(state);
		}else
		{
			System.out.println("enter valid state name");
		}
		
		if(null!=country && !"".equals(country)){
			address.setCountry(country);
		}else
		{
			System.out.println("enter valid country");
		}
		
		if(null!=postcode && !"".equals(postcode)){
			address.setPostcode(postcode);
		}else
		{
			System.out.println("enter valid postal code");
		}
		
		return address;
		
		
		
	}


}
