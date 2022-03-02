package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(){
        return "home.html";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "banner.html";
    }

    @RequestMapping //this annotation without any parameter is equal to ("/")
    // which means http://localhost/9090 would shows the view and we don't need to go inside the oage
    public String defualt(){
        return "banner.html";
    }


}
