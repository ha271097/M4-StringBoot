package com.codegym.m4b17th.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RoleController {
    @GetMapping("/")
    public ModelAndView nonRole(){
        return new ModelAndView("/nonrole");
    }
    @GetMapping("/user")
    public ModelAndView userRole(){
        return new ModelAndView("/userrole");
    }
    @GetMapping("/adminrole")
    public String adminRole(){
        return "redirect:/adminrole";
    }

}
