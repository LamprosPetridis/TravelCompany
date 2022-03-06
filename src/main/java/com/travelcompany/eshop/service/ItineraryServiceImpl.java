package com.travelcompany.eshop.service;

import com.travelcompany.eshop.excemption.ItineraryException;
import com.travelcompany.eshop.model.Itinerary;
import com.travelcompany.eshop.repository.ItineraryRepository;
import com.travelcompany.eshop.repository.ItineraryRepositoryImpl;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class ItineraryServiceImpl implements ItineraryService {
    private ItineraryRepository itineraryRepository = new ItineraryRepositoryImpl();

    public ItineraryServiceImpl(ItineraryRepository itineraryRepository){
        this.itineraryRepository =  itineraryRepository;
    }

    @Override
    public void createItinerary(Itinerary itinerary) throws ItineraryException {
        itineraryRepository.createItinerary(itinerary);
    }

    @Override
    public Itinerary returnItinerary(Integer id) throws ItineraryException {
        return itineraryRepository.readItinerary(id);
    }

    @Override
    public List<Itinerary> returnItinerary() throws ItineraryException {
        return itineraryRepository.readItinerary();
    }
}
