package pl.pjatk.marlew.zjazd1;

import org.springframework.stereotype.Component;

@Component
public class MyFirstComponent {
    public MyFirstComponent() {
        System.out.println("Hello from MyFirstComponent");
    }

    public void printHello() {
        System.out.println("Hello MyFirstComponent - printHello()");
    }
}
