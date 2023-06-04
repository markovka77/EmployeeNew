package com.pro.sky.hwlist;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeNotFoundException extends Exception{
    public EmployeeNotFoundException(String masssage) {
        super("EmployeeNotFound");
    }

}
