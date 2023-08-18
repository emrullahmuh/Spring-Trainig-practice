package com.cydeo.model;

import com.cydeo.enUm.QuantityType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Ingredients {
    private String name;
    private int quantity;
    private QuantityType quantityType;
}
