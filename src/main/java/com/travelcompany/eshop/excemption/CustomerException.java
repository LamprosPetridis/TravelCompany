package com.travelcompany.eshop.excemption;

import com.travelcompany.eshop.model.Customer;

public class CustomerException extends Exception {
    public CustomerException(String message){
        super(message);
    }
}
