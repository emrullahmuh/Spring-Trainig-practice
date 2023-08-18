package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Map;
@AllArgsConstructor
@Getter
@Setter
@Component
public class Cart {
    private Map<Product,Integer>productMap;
    private BigDecimal cartTotalAmount;

    public Cart() {
    }
}
