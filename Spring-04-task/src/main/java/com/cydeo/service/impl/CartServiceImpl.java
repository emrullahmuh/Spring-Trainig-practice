package com.cydeo.service.impl;

import com.cydeo.model.Cart;
import com.cydeo.model.CartItem;
import com.cydeo.service.CartService;
import org.springframework.stereotype.Service;

import javax.print.DocFlavor;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


import static com.cydeo.service.impl.ProductServiceImpl.PRODUCT_LIST;

@Service
public class CartServiceImpl implements CartService {
    public static List<Cart> CART_LIST = new ArrayList<>();
    @Override
    public List<Cart> retrieveCartList() {
        return CART_LIST;
    }
    @Override
    public List<CartItem> retrieveCartDetail(UUID cartId) {
    List<CartItem>cartitem= (List<CartItem>) CART_LIST.stream().filter(p->p.getId().toString().equals(cartId.toString())).map(p->p.getCartItemList());

        return  cartitem;
    }

    @Override
    public void initialiseCartList() {
        Cart cart1 = new Cart();
        cart1.setId(UUID.randomUUID());
        List<CartItem> cartItemList = new ArrayList<>();

        CartItem cartItem1 = new CartItem();
        cartItem1.setQuantity(PRODUCT_LIST.get(0).getQuantity());
        cartItem1.setProduct(PRODUCT_LIST.get(0));

        CartItem cartItem2 = new CartItem();
        cartItem2.setQuantity(PRODUCT_LIST.get(2).getQuantity());
        cartItem2.setProduct(PRODUCT_LIST.get(2));
        cartItemList.add(cartItem1);
        cartItemList.add(cartItem2);

        List<CartItem> cartItemList1 = new ArrayList<>();

        CartItem cartItem3 = new CartItem();
        cartItem3.setQuantity(PRODUCT_LIST.get(1).getQuantity());
        cartItem3.setProduct(PRODUCT_LIST.get(1));

        CartItem cartItem4 = new CartItem();
        cartItem4.setQuantity(PRODUCT_LIST.get(3).getQuantity());
        cartItem4.setProduct(PRODUCT_LIST.get(3));
        cartItemList1.add(cartItem3);
        cartItemList1.add(cartItem4);
        cartItemList1.add(cartItem2);


        cart1.setCartItemList(cartItemList);
        BigDecimal cart1TotalAmount = BigDecimal.ZERO;
        BigDecimal cart2TotalAmount = BigDecimal.ZERO;



        List<CartItem>cart01=new ArrayList<>();
        Integer quan=0;
        // todo change to stream
        for (CartItem cartItem : cartItemList){
        quan =cartItem.getQuantity();
             cart1TotalAmount = cart1TotalAmount.add(cartItem.getProduct().getPrice().multiply(BigDecimal.valueOf(cartItem.getQuantity())));
        }


   //     cart1TotalAmount =  cartItemList.stream().map(p->p.getProduct().getPrice()).mapMultiToDouble(p->p.multiply(BigDecimal.valueOf(quan)))

        CART_LIST.add(cart1);
        cart1.setCartTotalAmount(cart1TotalAmount);
        Cart cart2 = new Cart();
        cart2.setId(UUID.randomUUID());
        cart2.setCartItemList(cartItemList1);

        // todo change to stream
        for (CartItem cartItem : cartItemList1){
            cart2TotalAmount = cart1TotalAmount.add(cartItem.getProduct().getPrice().multiply(BigDecimal.valueOf(cartItem.getQuantity())));

        }

     //   List<CartItem>cartitem=cart




        cart2.setCartTotalAmount(cart2TotalAmount);
        CART_LIST.add(cart2);

    }
}
