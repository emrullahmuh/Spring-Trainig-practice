package comcyde.model;

import comcyde.Enum.States;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Address {
    private String country;
    private States state;
    private String city;
    private String area;
private String zipCode;
}
