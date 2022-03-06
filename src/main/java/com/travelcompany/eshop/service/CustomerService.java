package com.travelcompany.eshop.service;

import com.travelcompany.eshop.model.Customer;
import com.travelcompany.eshop.excemption.CustomerException;

import java.util.List;

public interface CustomerService {
    void createCustomer(Customer customer) throws CustomerException;
    Customer returnCustomer(Integer id) throws CustomerException;
    List<Customer> returnCustomer() throws CustomerException;
}
