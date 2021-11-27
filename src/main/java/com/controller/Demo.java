package com.controller;

import com.model.Setting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Demo {
    @GetMapping("/home")
    public ModelAndView getHome(){
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("setting", new Setting());
        return modelAndView;
    }
    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute Setting setting){
        ModelAndView modelAndView = new ModelAndView("save");
        modelAndView.addObject("setting", setting);
        return modelAndView;
    }
}
