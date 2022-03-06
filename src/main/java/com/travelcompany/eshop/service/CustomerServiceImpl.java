package com.travelcompany.eshop.service;

import com.travelcompany.eshop.model.Customer;
import com.travelcompany.eshop.repository.CustomerRepository;
import com.travelcompany.eshop.repository.CustomerRepositoryImpl;
import com.travelcompany.eshop.excemption.CustomerException;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository = new CustomerRepositoryImpl();

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void createCustomer(Customer customer) throws CustomerException {
        if (customer.getEmail() == "<whatever>@travelcompany.com") {
            throw new CustomerException("Please select another email address");
        }else
            customerRepository.createCustomer(customer);
    }


    @Override
    public Customer returnCustomer(Integer id) {
        return customerRepository.readCustomer(id);

    }

    @Override
    public List<Customer> returnCustomer(){
        return customerRepository.readCustomer();
    }

}
