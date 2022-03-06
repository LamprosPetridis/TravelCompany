package com.travelcompany.eshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Itinerary {
    private int id;
    private String departureCode;
    private String destinationCode;
    private String departureDate;
    private String airline;
    private int basicPrice;
}
