package pl.pjatk.marlew.zjazd1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cwiczenie6 {
    public Cwiczenie6(@Value("${default.value:default}") String valueFromProperties) {
        System.out.println(valueFromProperties);
    }
}
