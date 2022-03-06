package com.travelcompany.eshop.service;

import com.travelcompany.eshop.excemption.ItineraryException;
import com.travelcompany.eshop.model.Itinerary;
import com.travelcompany.eshop.model.Ticket;

import java.util.List;

public interface ItineraryService {
    void createItinerary(Itinerary itinerary) throws ItineraryException;
    Itinerary returnItinerary(Integer id) throws ItineraryException;
    List<Itinerary> returnItinerary() throws ItineraryException;
}
