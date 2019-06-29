package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Customer;
@Repository
public class CustomerDaoImpl implements ICustomerDao{

	@Autowired
private SessionFactory sf;
	@Override
	public Customer validateCustomer(String username, String password) {
		String jpql="select c from Customer c where c.username=:user and c.password=:pass";
		Customer c=sf.getCurrentSession().createQuery(jpql, Customer.class).setParameter("user", username).setParameter("pass", password).getSingleResult();
		if(c==null)
		return null;
		else
			return c;
	}

	@Override
	public List<Customer> getAllCustomer() {
		String jpql="select v from Customer AS v";
		List<Customer> cust = sf.getCurrentSession().createQuery(jpql,Customer.class).getResultList();
		return cust;
	}

}
