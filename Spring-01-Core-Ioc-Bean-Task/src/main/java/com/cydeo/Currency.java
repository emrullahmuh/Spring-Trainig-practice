package com.cydeo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@AllArgsConstructor

public class Currency {
    private String code;
    private String name;

    public Currency() {
    }
}
