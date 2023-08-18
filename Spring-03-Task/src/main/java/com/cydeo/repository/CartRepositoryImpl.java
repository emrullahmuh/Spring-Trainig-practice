package com.cydeo.repository;

import com.cydeo.model.Product;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
@Component
public class CartRepositoryImpl implements CartRepsitory {
    @Override
    public boolean addCartDataBase(Product product, int quantity) {
        System.out.println(product.getName()+ " is added to data base");


        return true;
    }
}
