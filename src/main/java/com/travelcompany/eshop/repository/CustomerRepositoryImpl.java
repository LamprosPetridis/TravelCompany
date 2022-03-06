package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.excemption.CustomerException;
import com.travelcompany.eshop.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CustomerRepositoryImpl implements CustomerRepository{
    private final List<Customer> customers = new ArrayList<>();



    @Override
    public boolean createCustomer(Customer customer) {
        customers.add(customer);
        return true;
    }

    @Override
    public Customer readCustomer(int id) {
        for(Customer customer: customers){
            if(customer.getId()==id)
                return customer;
        }
        return null; // If no customer is found
    }

    @Override
    public List<Customer> readCustomer() {
        List<Customer> returnCustomers =  new ArrayList<>();
        for (Customer customer : customers){
            returnCustomers.add(customer);
        }
        return returnCustomers;
    }

    @Override
    public boolean updateCustomer(int id, String newAddress) {
        Customer customer = readCustomer(id);
        if(customer==null)
            return false;
        customer.setAddress(newAddress);
        return true;
    }

    @Override
    public boolean deleteCustomer(int id) throws CustomerException {
        Customer customer = readCustomer(id);
        if(customer==null)
            throw new CustomerException("Customer not found");
        customers.remove(customer);
        return true;
    }


}
