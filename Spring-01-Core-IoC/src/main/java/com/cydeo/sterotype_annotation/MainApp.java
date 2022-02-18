package com.cydeo.sterotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigCourse.class);

        Selenium selenium = container.getBean(Selenium.class);
        selenium.getTeachingHours();

        container.getBean(Java.class).getTeachingHours();

        container.getBean(Agile.class).getTeachingHours();


    }
}
