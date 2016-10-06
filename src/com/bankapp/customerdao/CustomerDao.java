package com.bankapp.customerdao;

import com.bankapp.model.Customer;

public interface CustomerDao {
	public Customer createCustomer(Customer customer);
	public void searchCustomer();
	public void deleteCustomer();
}
