package com.travelcompany.eshop.service;

import com.travelcompany.eshop.excemption.PurchaseException;

public interface PurchaseService {
    void purchase(Integer passengerId, Integer itineraryId, String paymentMethod) throws PurchaseException;
}
