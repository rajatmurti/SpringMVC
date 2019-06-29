package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.ICustomerDao;
import com.app.pojos.Customer;
@Service
@Transactional
public class CustomerService implements ICustomerService {

	@Autowired
	private ICustomerDao dao;
	@Override
	public Customer validateCustomer(String username, String password) {
		Customer c = dao.validateCustomer(username, password);
		return c;
	}

	@Override
	public List<Customer> getAllCustomer() {
		List<Customer> custList= dao.getAllCustomer();
		return custList;
	}

}
