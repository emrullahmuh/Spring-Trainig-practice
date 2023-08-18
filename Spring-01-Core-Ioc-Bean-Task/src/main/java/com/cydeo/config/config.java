package com.cydeo.config;

import com.cydeo.Currency;
import com.cydeo.account.Current;
import com.cydeo.account.Saving;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;
import java.util.UUID;

@Configuration
public class config {
@Bean
    public Currency currency(){
  Currency currency=new Currency();
    currency.setCode("ALOHA");
   currency.setName("maloha");
    return currency;
}
@Bean
    public Current current(Currency currency){
Current current=new Current(currency, BigDecimal.ONE,UUID.randomUUID());
   return current;
    }
    @Bean
public Saving saving(Currency currency){
    Saving saving=new Saving(currency,BigDecimal.ONE,UUID.randomUUID());
return saving;
}



}
