package com.cydeo.streotype_annotation.casefactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@AllArgsConstructor
public class Dimensions {
    private int width;
    private int height;
    private int depth;

    public void prespower() {
        System.out.println("pres power");
    }

    public Dimensions(){
        this.depth=12;
        this.height=32;
        this.width=43;
    }
}
