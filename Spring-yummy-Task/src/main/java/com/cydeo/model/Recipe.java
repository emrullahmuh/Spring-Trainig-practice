package com.cydeo.model;

import com.cydeo.enUm.RecioeType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@AllArgsConstructor
@Getter
@Setter
public class Recipe {
    private UUID id;
    private String name;
    private String  duration;
    private String preparation;
    private List<Ingredients> ingredients;
private RecioeType recioeType;


}
