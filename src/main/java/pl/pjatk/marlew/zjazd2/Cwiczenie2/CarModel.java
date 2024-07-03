package pl.pjatk.marlew.zjazd2.Cwiczenie2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CarModel {
    private Integer yearOfProduction;
    private String name;
    private String vin;
}
