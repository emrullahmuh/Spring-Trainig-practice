package com.cydeo.Config;

import com.cydeo.casefactory.Case;
import com.cydeo.casefactory.DellCase;
import com.cydeo.casefactory.Dimensions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.naming.spi.DirectoryManager;

@Configuration
public class PcConfig {
@Bean
   public Dimensions dimensions(){
       return new Dimensions(18,29,34);
   }
@Bean
    public Case DellCase(Dimensions dimensions){
        return new DellCase("21se","dw31","212d",dimensions );
        }
    }

