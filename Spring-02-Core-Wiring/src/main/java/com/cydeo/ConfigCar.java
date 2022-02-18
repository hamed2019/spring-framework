package com.cydeo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {

    @Bean
    Car car(){
        Car c = new Car();
        c.setMake("Honda");
        return c;
    }

//    Direct WIRING
//    @Bean
//    Person person(){
//        Person p = new Person();
//        p.setName("Hamed");
//        p.setCar(car()); ==> we called the above method to make a relationship between person object and car object
//        return p;
//    }

    //Autowiring
    @Bean
    Person person(Car car){
        Person p = new Person();
        p.setName("Hamed");
        p.setCar(car);
        return p;
    }
}
