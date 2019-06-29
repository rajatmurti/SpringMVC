package com.app.dao;
import java.util.List;

import com.app.pojos.Customer;;
public interface ICustomerDao {
Customer validateCustomer(String username,String password);
List<Customer> getAllCustomer();
}
