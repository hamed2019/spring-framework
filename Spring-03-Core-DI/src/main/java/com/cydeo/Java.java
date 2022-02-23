package com.cydeo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
//    If we put @AllArgsConstructor In the class level, we don't need to even create constructor, spring does the injection by itself
@AllArgsConstructor
public class Java {

//    Filed injection using autowire annotation which is not recomended by spring
//    @Autowired
//    OfficeHours officeHours;


//    Constructor injection
    OfficeHours officeHours;

//    @Autowired ==> after spring 4.3 we dont need to put autowired annotation. Spring does it automatically
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    public void getTeachingHours(){
        System.out.println("Weekly teaching hours: "+ (20+officeHours.getHours()));

    }
}
