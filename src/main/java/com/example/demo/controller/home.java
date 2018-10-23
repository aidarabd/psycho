package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class home {

    @RequestMapping("/")
    public ModelAndView homee(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;

    }
    @RequestMapping("/test")
    public String test(){
        return "home.html";
    }

}
