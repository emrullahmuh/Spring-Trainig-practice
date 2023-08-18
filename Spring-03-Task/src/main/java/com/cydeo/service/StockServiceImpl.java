package com.cydeo.service;

import com.cydeo.model.Product;
import com.cydeo.service.StockService;
import org.springframework.stereotype.Component;

@Component
public class StockServiceImpl implements StockService {
    @Override
    public boolean checkStock(Product product, int quantity) {
       return product.getRemainquantity()>quantity;

    }
}
