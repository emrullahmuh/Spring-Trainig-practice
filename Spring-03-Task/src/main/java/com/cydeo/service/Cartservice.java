package com.cydeo.service;

import com.cydeo.model.Cart;
import com.cydeo.model.Product;

public interface Cartservice {
    Cart addCart(Product product,int quantity);
}
