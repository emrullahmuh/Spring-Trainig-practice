package com.cydeo.bean_annotation.config;


import com.cydeo.bean_annotation.casefactory.Case;
import com.cydeo.bean_annotation.casefactory.DellCase;
import com.cydeo.bean_annotation.monitorfactory.AcerMonitor;
import com.cydeo.bean_annotation.monitorfactory.Monitor;
import com.cydeo.bean_annotation.monitorfactory.SonyMonitor;
import com.cydeo.bean_annotation.motherboardfactory.AsusMotherboard;
import com.cydeo.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ComputerConfigration {
    @Bean(name = "sony")// you can give special name or use method name
public Monitor SonyMonitor(){
    return new SonyMonitor("12x3","213ed",23);

}
@Bean(name = "asus")
@Primary  // make default
public Monitor AcerMonitor(){
        return new AcerMonitor("32ds","dw3q",32);
}
@Bean
    public Case DellCase(){
        return new DellCase("mew2","wd22","21s");
    }
@Bean
    public Motherboard AsusMotherBoard(){
        return new AsusMotherboard("23CS","D3D3",12,32,"CE3");
    }
}
