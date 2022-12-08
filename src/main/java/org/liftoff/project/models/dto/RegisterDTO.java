package org.liftoff.project.models.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class RegisterDTO extends LoginDTO{

    //variable


    @NotNull
    @NotBlank
    @Size( max = 4, message = "Invalid date of birth Must be 4 characters.")
    private Date dateOfBirth;

    @NotNull
    @NotBlank
    @Size(min = 5, max = 30, message = "Invalid password. Must be between 5 and 30 characters.")
    private Integer phoneNumber;

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    private String verifyPassword;
    public String getVerifyPassword() {

        return verifyPassword;
    }
    //method
    public void setVerifyPassword(String verifyPassword) {

        this.verifyPassword = verifyPassword;
    }

}
