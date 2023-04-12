package com.luv2code.springdemo.mvc.validation.validation;

import com.luv2code.springdemo.mvc.validation.dto.MemberDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class MemberValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return MemberDto.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        ValidationUtils.rejectIfEmpty(errors,"id", "member.id.empty", "아이디필수항목입니다.");
        ValidationUtils.rejectIfEmpty(errors,"pw", "member.pw.empty", "패스워드필수항목입니다.");

        MemberDto memberDto = (MemberDto) target;


    }
}
