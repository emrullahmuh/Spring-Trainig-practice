package com.cydeo.casefactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Dimensions {
    private int width;
    private int height;
    private int depth;
    public void prespower(){
        System.out.println("pres power");
    }
}
