package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.excemption.TicketException;
import com.travelcompany.eshop.model.Ticket;

import java.util.List;

public interface TicketRepository {
    //CRUD Create Read Update Delete

    boolean createTicket(Ticket ticket);
    Ticket readTicket(int id);
    List<Ticket> readTicket();
    boolean updateTicket(int id, String newAddress);
    boolean deleteTicket(int id) throws TicketException;
}
