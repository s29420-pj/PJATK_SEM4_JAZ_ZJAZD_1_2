package pl.pjatk.marlew.zjazd1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cwiczenie5 {
    public Cwiczenie5(@Value("${my.custom.property}") String valueFromProperties) {
        System.out.println(valueFromProperties);
    }
}
