package com.travelcompany.eshop.usecases;

import com.travelcompany.eshop.excemption.CustomerException;
import com.travelcompany.eshop.excemption.ItineraryException;
import com.travelcompany.eshop.excemption.TicketException;
import com.travelcompany.eshop.model.Customer;
import com.travelcompany.eshop.model.Itinerary;
import com.travelcompany.eshop.model.Ticket;
import com.travelcompany.eshop.service.*;

import java.math.BigDecimal;

public class Test {


    public void addTestData() throws CustomerException, ItineraryException, TicketException {
        CustomerService customerService = new CustomerServiceImpl();
        ItineraryService itineraryService = new ItineraryServiceImpl();
        TicketService ticketService = new TicketServiceImpl();

        customerService.createCustomer(new Customer(1,"Maria Iordanou","miordanou@mail.com","Athens","Greek","Individual"));
        customerService.createCustomer(new Customer(2,"Dimitriou Dimitrios","ddmitriou@gmail","Athens","Greek","Individual"));
        customerService.createCustomer(new Customer(3,"Ioannis Ioannou","iioannou@mail.com","Athens","Greek","Business"));
        customerService.createCustomer(new Customer(4,"Antonio Molinari","amolinari@mail.com","Milan","Italian","Individual"));
        customerService.createCustomer(new Customer(5,"Frederico Rossi","frossi@mail.com" ,"Milan", "Italian" ,"Individual"));
        customerService.createCustomer(new Customer(6,"Mario Conti","mconti@mail.com" ,"Rome", "Italian" ,"Business"));
        customerService.createCustomer(new Customer(7,"Nathan Martin" ,"nmartin@mail.com" ,"Lyon", "French" ,"Business"));
        customerService.createCustomer(new Customer(8,"Enzo Collin" ,"ecollin@mail.com", "Lyon" ,"French", "Individual"));
        customerService.createCustomer(new Customer(9,"Frederic Michel" ,"fmichel@mail.com", "Athens", "French" ,"Individual"));

        itineraryService.createItinerary(new Itinerary(1,"ATH", "PAR,", "35:00.0", "SkyLines", 300));

        ticketService.createTicket(new Ticket(1,1,3,"Cash",330));
        int totalAmount = 0;
        int ticketsNumber = ticketService.returnTicket().size();
        for (Ticket ticket : ticketService.returnTicket()){
            totalAmount += ticket.getPaymentAmount();
        }

        System.out.println("The total number of tickets is "+ticketsNumber+" and the cost is "+ totalAmount);
        System.out.println("The total number of offered itineraries is " + itineraryService.returnItinerary().size());


    }
//    public void createCustomer(Customer customer){
//        CustomerRepository customers = new CustomerRepositoryImpl();
//
//        customers.createCustomer(customer);
//    }
//
//    public void createItinerary(Itinerary itinerary){
//        ItineraryRepository itineraries = new ItineraryRepositoryImpl();
//
//        itineraries.createItinerary(itinerary);
//    }
//
//    public void createTicket(Ticket ticket){
//        TicketRepository tickets = new TicketRepositoryImpl();
//
//        tickets.createTicket(ticket);
//    }
//
//    public Customer readCustomer(int id){
//        CustomerRepository customers = new CustomerRepositoryImpl();
//
//        return customers.readCustomer(id);
//    }
}
