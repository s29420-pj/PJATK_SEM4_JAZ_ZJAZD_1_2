package pl.pjatk.marlew.zjazd1;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyThirdComponent {

    public MyThirdComponent(ApplicationContext applicationContext) {
        MyFirstComponent myFirstComponent = applicationContext.getBean("myFirstComponent", MyFirstComponent.class);
        myFirstComponent.printHello();

        MySecondComponent mySecondComponent = applicationContext.getBean("mySecondComponent", MySecondComponent.class);
        mySecondComponent.printHello();
    }
}
