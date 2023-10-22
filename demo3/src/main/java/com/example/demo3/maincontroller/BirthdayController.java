package com.example.demo3.maincontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/birthday")
public class BirthdayController {
    @RequestMapping("/happy")
    public String main(){
        System.out.println("66666666");
        return "forward:/birthday/index.html";
    }
}
