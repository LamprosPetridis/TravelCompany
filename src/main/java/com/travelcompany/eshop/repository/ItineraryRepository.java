package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.excemption.CustomerException;
import com.travelcompany.eshop.excemption.ItineraryException;
import com.travelcompany.eshop.model.Customer;
import com.travelcompany.eshop.model.Itinerary;

import java.util.List;

public interface ItineraryRepository {
    //CRUD Create Read Update Delete

    boolean createItinerary(Itinerary itinerary);
    Itinerary readItinerary(int id);
    List<Itinerary> readItinerary();
    boolean updateItinerary(int id, String newAddress);
    boolean deleteItinerary(int id) throws ItineraryException;
}
