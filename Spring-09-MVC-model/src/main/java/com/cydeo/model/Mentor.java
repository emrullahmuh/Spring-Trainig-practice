package com.cydeo.model;

import com.cydeo.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mentor {
    private String firstneme;
     private String lastname;
     private int age;
     private Gender gender;
}
