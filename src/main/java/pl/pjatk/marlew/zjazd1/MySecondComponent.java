package pl.pjatk.marlew.zjazd1;

import org.springframework.stereotype.Component;

@Component
public class MySecondComponent {
    public MySecondComponent(MyFirstComponent myFirstComponent) {
        System.out.println("Hello from MySecondComponent");
        myFirstComponent.printHello();
    }

    public void printHello() {
        System.out.println("Hello MySecondComponent - printHello()");
    }
}
