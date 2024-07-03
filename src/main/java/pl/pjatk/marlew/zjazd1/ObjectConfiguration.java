package pl.pjatk.marlew.zjazd1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ObjectConfiguration {

    @Bean
    public ObjectPOJO object() {
        return new ObjectPOJO();
    }

    @Bean
    public List<String> defaultData() {
        return List.of("string1","string2","string3","string4","string5");
    }
}
