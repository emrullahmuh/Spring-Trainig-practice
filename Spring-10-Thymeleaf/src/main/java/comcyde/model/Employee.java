package comcyde.model;

import comcyde.Enum.States;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.time.LocalDateTime;
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Employee {
    private String firstName;
    private String lastName;
    private LocalDateTime birthDay;
    private String email;
    private String passWord;
     private String Street;
private String  apartment;
private String city;
private String state;
private String zip;
}
