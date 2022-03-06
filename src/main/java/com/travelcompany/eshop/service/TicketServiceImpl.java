package com.travelcompany.eshop.service;

import com.travelcompany.eshop.excemption.TicketException;
import com.travelcompany.eshop.model.Ticket;
import com.travelcompany.eshop.repository.TicketRepository;
import com.travelcompany.eshop.repository.TicketRepositoryImpl;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class TicketServiceImpl implements TicketService {
    private TicketRepository ticketRepository = new TicketRepositoryImpl();

    public TicketServiceImpl (TicketRepository ticketRepository){
        this.ticketRepository = ticketRepository;
    }


    @Override
    public void createTicket(Ticket ticket) throws TicketException {
        ticketRepository.createTicket(ticket);
    }

    @Override
    public Ticket returnTicket(Integer id) throws TicketException {
        return ticketRepository.readTicket(id);
    }

    @Override
    public List<Ticket> returnTicket() throws TicketException {
        return ticketRepository.readTicket();
    }
}
