package com.luv2code.springdemo.mvc.validation.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.stereotype.Component;

@Component
public class MemberDto {

    private int no;

    //@NotNull(message = " 필수 항목입니다")
    //@Size(min = 1, max = 32) //
    private String id;

    //@NotNull
    //@Size(min = 8, max = 32, message = "비밀번호 오류입니다.")
    private String pw;

    public MemberDto() {
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
            "no=" + no +
            ", id='" + id + '\'' +
            ", pw='" + pw + '\'' +
            '}';
    }
}
