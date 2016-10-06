package com.bankapp.customerdao.impl;

import java.util.HashMap;
import java.util.Map;

import com.bankapp.customerdao.CustomerDao;
import com.bankapp.model.Customer;

public class CustomerDaoImpl implements CustomerDao {
	
	private static Map<String,Customer> map=new HashMap<String,Customer>();
	private static int accntNo=0;
	

	public Customer createCustomer(Customer customer) {
		Customer result = map.put(String.valueOf(++accntNo), customer);
		System.out.println(map);
		return result;
		
	}

	public void searchCustomer() {
		// TODO Auto-generated method stub

	}

	public void deleteCustomer() {
		// TODO Auto-generated method stub

	}

}
