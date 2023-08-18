package com.cydeo.repository;

import com.cydeo.model.Product;

public interface CartRepsitory {
    boolean addCartDataBase(Product product,int quantity);
}
