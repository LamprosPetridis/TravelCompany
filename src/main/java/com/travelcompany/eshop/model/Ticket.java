package com.travelcompany.eshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    private int id;
    private int passengerId;
    private int itineraryId;
    private String paymentMethod;
    private Integer paymentAmount;
}
