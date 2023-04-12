package com.luv2code.springdemo.mvc.validation.controller;

import com.luv2code.springdemo.mvc.validation.dto.Customer;
import javax.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/customer")
@Controller
public class CustomerController {

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {

        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true); // whitespace 제거

        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);

    }


    @RequestMapping("/showForm")
    public String showForm(Model theModel) {
        System.out.println("--- / 들어옴");

        theModel.addAttribute("customer", new Customer());

        return "customer-form";
    }

    @RequestMapping(value = "/processForm", method = RequestMethod.POST)
    public String processForm(
        @Valid @ModelAttribute("customer") Customer customer,
        BindingResult theBindingResult) {

        System.out.println("Last name |" + customer.getLastName() + "|"); // 공백처리 ?

        if (theBindingResult.hasErrors()) {
            return "customer-form";
        }

        return "customer-confirmation";
    }

}
