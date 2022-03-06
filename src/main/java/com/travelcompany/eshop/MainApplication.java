package com.travelcompany.eshop;

import com.travelcompany.eshop.excemption.CustomerException;
import com.travelcompany.eshop.excemption.ItineraryException;
import com.travelcompany.eshop.excemption.TicketException;
import com.travelcompany.eshop.usecases.Test;

public class MainApplication {

    public static void main(String[] args) throws CustomerException, ItineraryException, TicketException {
        Test test = new Test();
        test.addTestData();




    }
}
