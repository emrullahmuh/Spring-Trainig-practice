package com.cydeo;

import com.cydeo.account.Current;
import com.cydeo.account.Saving;
import com.cydeo.config.config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(config.class);

        Saving saving=container.getBean(Saving.class);
        Current current=container.getBean(Current.class);
        saving.initialize();
        current.initialize();
        }

}
