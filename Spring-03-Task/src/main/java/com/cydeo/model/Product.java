package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
@AllArgsConstructor
@Getter
@Setter
@Component
public class Product {
    private String name;
    private int quantity;
    private int remainquantity;
    private BigDecimal price;

    public Product() {

    }
}
