package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.model.Customer;
import com.travelcompany.eshop.excemption.CustomerException;

import java.util.List;

public interface CustomerRepository {
    //CRUD Create Read Update Delete

    boolean createCustomer(Customer customer);
    Customer readCustomer(int id);
    List<Customer> readCustomer();
    boolean updateCustomer(int id, String newAddress);
    boolean deleteCustomer(int id) throws CustomerException;

}
