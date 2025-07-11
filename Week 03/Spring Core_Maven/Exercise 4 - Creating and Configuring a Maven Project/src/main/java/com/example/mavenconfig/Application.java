package com.example.mavenconfig;

import com.example.mavenconfig.component.HelloComponent;
import com.example.mavenconfig.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloComponent helloComponent = context.getBean(HelloComponent.class);
        helloComponent.sayHello();
    }
}
