package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.excemption.ItineraryException;
import com.travelcompany.eshop.model.Itinerary;

import java.util.ArrayList;
import java.util.List;

public class ItineraryRepositoryImpl implements ItineraryRepository{
    private final List<Itinerary> itineraries = new ArrayList<>();

    @Override
    public boolean createItinerary(Itinerary itinerary) {
        // TO DO *****
        itineraries.add(itinerary);
        return false;
    }

    @Override
    public Itinerary readItinerary(int id) {
        for(Itinerary itinerary: itineraries){
            if(itinerary.getId()==id)
                return itinerary;
        }
        return null; // If no itinerary is found
    }

    @Override
    public List<Itinerary> readItinerary() {
        List<Itinerary> returnItineraries =  new ArrayList<>();
        for (Itinerary itinerary : itineraries){
            returnItineraries.add(itinerary);
        }
        return returnItineraries;
    }

    @Override
    public boolean updateItinerary(int id, String newAddress) {
        Itinerary itinerary = readItinerary(id);
        if(itinerary==null)
            return false;
        //itinerary.setSomething(newFlightCODE);
        return true;
    }

    @Override
    public boolean deleteItinerary(int id) throws  ItineraryException {
        Itinerary itinerary = readItinerary(id);
        if(itinerary==null)
            throw new ItineraryException();
        itineraries.remove(itinerary);
        return true;
    }
}
