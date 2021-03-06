package com.sda.json;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author marek swietlik
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String city;
    private String street;

}
