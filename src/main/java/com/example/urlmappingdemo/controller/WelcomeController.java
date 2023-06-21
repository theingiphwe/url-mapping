package com.example.urlmappingdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping("/meet")
    public String meeting(Model model){
        model.addAttribute("tagline","How are you");
        return "welcome";
    }
    @GetMapping("/greet")
    public String greeting(Model model){
        model.addAttribute("tagline","Hello human");
        return "welcome";
    }
    @GetMapping("/sayspring")
    public String saySpring(Model model){
        model.addAttribute("tagline","Say Spring MVC");
        return "welcome";
    }
    @GetMapping({"/","/home"})
    public String welcome(Model model){
        model.addAttribute("tagline","Welcome Spring MVC");
        return "welcome";
    }
}
