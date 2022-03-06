package com.travelcompany.eshop.service;

import com.travelcompany.eshop.excemption.PurchaseException;
import com.travelcompany.eshop.model.Ticket;
import com.travelcompany.eshop.repository.*;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
public class PurchaseServiceImpl implements PurchaseService{
    private CustomerRepository customerRepository = new CustomerRepositoryImpl();
    private ItineraryRepository itineraryRepository = new ItineraryRepositoryImpl();
    private TicketRepository ticketRepository = new TicketRepositoryImpl();
    private TicketService  ticketService = new TicketServiceImpl();

    @Override
    public void purchase(Integer passengerId, Integer itineraryId, String paymentMethod) throws PurchaseException {
        String passengerType = customerRepository.readCustomer(passengerId).getCategory();
        int basicPrice = itineraryRepository.readItinerary(itineraryId).getBasicPrice();
        int finalPrice;
        int discount = 0;
        if( passengerType == "Business"){
            discount = 10;
            if(paymentMethod=="Credit Card")
                discount = 20;
        }
        if( passengerType == "Individual"){
            basicPrice = basicPrice + basicPrice/100*20; //SURCHARGE
            if(paymentMethod=="Credit Card")
                discount = 10;
        }
        finalPrice = basicPrice - basicPrice/100*discount;
        Ticket ticket = new Ticket(ticketRepository.readTicket().size()+1,passengerId,itineraryId,paymentMethod,finalPrice);
        ticketRepository.createTicket(ticket);
    }
}
