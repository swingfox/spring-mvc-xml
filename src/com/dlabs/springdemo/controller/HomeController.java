package com.dlabs.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    
    @RequestMapping("/main")
    public String showMyPage(){
        return "main-menu";
    }
}
