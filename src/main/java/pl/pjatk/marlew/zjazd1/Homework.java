package pl.pjatk.marlew.zjazd1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Homework {

    @Bean
    @Profile("homework")
    @ConditionalOnProperty(value = "ownVariable", havingValue = "true")
    public Homework homework() {
        return new Homework();
    }
}
