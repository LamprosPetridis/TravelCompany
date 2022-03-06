package com.travelcompany.eshop.service;

import com.travelcompany.eshop.excemption.TicketException;
import com.travelcompany.eshop.model.Ticket;

import java.util.List;

public interface TicketService {
    void createTicket(Ticket ticket) throws TicketException;
    Ticket returnTicket(Integer id) throws TicketException;
    List<Ticket> returnTicket() throws TicketException;

}
