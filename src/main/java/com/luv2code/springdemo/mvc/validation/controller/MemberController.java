package com.luv2code.springdemo.mvc.validation.controller;

import com.luv2code.springdemo.mvc.validation.dto.MemberDto;
import com.luv2code.springdemo.mvc.validation.validation.MemberValidator;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MemberController {


    private final MemberValidator memberValidator;

    public MemberController(MemberValidator memberValidator) {
        this.memberValidator = memberValidator;
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(memberValidator);
    }

    //@RequestMapping("/")
    public String setUpForm(Model model) {
        System.out.println("--- / 들어옴");

        model.addAttribute("memberDto", new MemberDto());

        return "insert";
    }

    //@RequestMapping("/register")
    public String processForm(
        @Valid @ModelAttribute MemberDto memberDto,
        BindingResult bindingResult) {

        System.out.println("--- /insert");
        System.out.println("memberDto = " + memberDto);
        System.out.println("BindingResult = " + bindingResult);

        if (bindingResult.hasErrors()) {
            return "insert";
        }

        return "list";
    }


}
