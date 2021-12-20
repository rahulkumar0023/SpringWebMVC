package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

    public MyController() {
        System.out.println("Creating controller!!!!!!!!!!!!!!!!!!");
    }

    @RequestMapping(path="greeting", method = RequestMethod.GET)
    public String doGreeting(){
        return "greet";
    }

}
