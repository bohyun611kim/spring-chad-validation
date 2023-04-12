package com.kei890.validationtutorial.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {

    private String firstName;

    /*
        1. whitespace : |  kim  |  변환  |kim| 공백제거
        2. 입력을 안했을 경우 : null
     */
    @NotNull(message = "공백이 입력이되었습니다")
    @Size(min = 1, message = "is required")
    private String lastName;

    @Min(value = 0, message = "0 보다 커야합니다")
    @Max(value = 10, message = "10보다 작어야합니다")
    private int freePasses;


    // 우편번호
    @Pattern(regexp = "^[a-aA-Z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode;

    @NotNull(message = "필수항목입니다")
    @Pattern(regexp = "^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$", message = "이메일형식오류")
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
