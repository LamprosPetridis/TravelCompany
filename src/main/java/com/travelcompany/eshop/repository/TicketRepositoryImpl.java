package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.excemption.ItineraryException;
import com.travelcompany.eshop.excemption.TicketException;
import com.travelcompany.eshop.model.Customer;
import com.travelcompany.eshop.model.Itinerary;
import com.travelcompany.eshop.model.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketRepositoryImpl implements TicketRepository{
    private final List<Ticket> tickets = new ArrayList<>();

    @Override
    public boolean createTicket(Ticket ticket) {
        //TO DO
        tickets.add(ticket);
        return true;
    }

    @Override
    public Ticket readTicket(int id) {
        for(Ticket ticket: tickets){
            if(ticket.getId()==id)
                return ticket;
        }
        return null; // If no ticket is found
    }

    @Override
    public List<Ticket> readTicket() {
        List<Ticket> returnTickets =  new ArrayList<>();
        for (Ticket ticket : tickets){
            returnTickets.add(ticket);
        }
        return returnTickets;
    }

    @Override
    public boolean updateTicket(int id, String newAddress) {

        Ticket ticket = readTicket(id);
        if(ticket==null)
            return false;
        //itinerary.setSomething(newFlightCODE);
        return true;
    }

    @Override
    public boolean deleteTicket(int id) throws TicketException {
        Ticket ticket = readTicket(id);
        if(ticket==null)
            throw new TicketException();
        tickets.remove(ticket);
        return true;
    }
}
