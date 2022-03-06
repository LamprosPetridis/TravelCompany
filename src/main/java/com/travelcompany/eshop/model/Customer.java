package com.travelcompany.eshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customer {
    private int id;
    private String name;
    private String email;
    private String address;
    private String nationality;
    private String category;
}
