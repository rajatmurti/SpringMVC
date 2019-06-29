package com.app.service;

import java.util.List;

import com.app.pojos.Customer;

public interface ICustomerService {
	Customer validateCustomer(String username,String password);
	List<Customer> getAllCustomer();

}
