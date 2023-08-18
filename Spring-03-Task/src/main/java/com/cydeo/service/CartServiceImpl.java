package com.cydeo.service;

import com.cydeo.model.Cart;
import com.cydeo.model.Product;
import com.cydeo.repository.CartRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
@Component
public class CartServiceImpl implements Cartservice {
  @Autowired
  private CartRepsitory cartRepsitory;
   @Autowired private StockService service;



    @Override
    public Cart addCart(Product product, int quantity) {
       boolean stockAvailable=service.checkStock(product,quantity);
Cart cart=new Cart();
if (!stockAvailable){
    return cart;
}

cartRepsitory.addCartDataBase(product,quantity);
        BigDecimal totalamount=product.getPrice().multiply(BigDecimal.valueOf(quantity));
   Map<Product,Integer> productMap=new HashMap<>();
   productMap.put(product,quantity);
   cart.setCartTotalAmount(totalamount);
   cart.setProductMap(productMap);
   return cart;

    }
}
