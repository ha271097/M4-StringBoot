package com.codegym.m4b17th.controller;

import com.codegym.m4b17th.repo.entity.Customer;
import com.codegym.m4b17th.service.customerservice.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @GetMapping("")
    public ModelAndView fillALl(){
        ModelAndView mav = new ModelAndView("/home");
        mav.addObject("list", customerService.fillAll());
        return mav;
    }

    @GetMapping("/delete")
    public ModelAndView delete(Long id){
        customerService.delete(id);
        return new ModelAndView("home");
    }

    @GetMapping("/update")
    public ModelAndView update (Long id){
        ModelAndView mav = new ModelAndView("/update");
        mav.addObject("cus", new Customer());
        return mav;
    }

    @GetMapping("/create")
    public ModelAndView create (Long id){
        ModelAndView mav = new ModelAndView("/create");
        mav.addObject("cus", new Customer());
        return mav;
    }
    @PostMapping("create")
    public String createNow(Customer customer){
//        ModelAndView mav = new ModelAndView("/home");
        customerService.updateOrSave(customer);
        return "redirect:/home";
    }

    @GetMapping("/remove")
    public String remove(Long id) {
        customerService.delete(id);
        return "redirect:/home";
    }

    @PostMapping("/update")
    public String updateNow(Customer customer){
        customerService.updateOrSave(customer);
//        ModelAndView mav = new ModelAndView("/home");
        return "redirect:/home";
    }

}
