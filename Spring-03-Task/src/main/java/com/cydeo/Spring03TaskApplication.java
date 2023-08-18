package com.cydeo;

import com.cydeo.config.ConfigApp;
import com.cydeo.model.Product;
import com.cydeo.repository.CartRepositoryImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Spring03TaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring03TaskApplication.class, args);
        BeanFactory container=new AnnotationConfigApplicationContext(ConfigApp.class);
Product product=container.getBean(Product.class);
        CartRepositoryImpl cart=new CartRepositoryImpl();
        cart.addCartDataBase(product,3);

    }



}
