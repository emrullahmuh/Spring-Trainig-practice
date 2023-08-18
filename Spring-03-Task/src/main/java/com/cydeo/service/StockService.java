package com.cydeo.service;

import com.cydeo.model.Product;

public interface StockService {
    boolean checkStock(Product product,int quantity);
}
