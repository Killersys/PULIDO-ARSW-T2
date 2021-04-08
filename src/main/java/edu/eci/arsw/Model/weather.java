package edu.eci.arsw.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class weather {
    int id ;
    Main main ;
    String description;
    String icon;
}
