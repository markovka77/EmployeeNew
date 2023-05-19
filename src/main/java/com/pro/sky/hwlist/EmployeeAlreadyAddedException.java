package com.pro.sky.hwlist;

public class EmployeeAlreadyAddedException extends RuntimeException {
    public EmployeeAlreadyAddedException(String masssage){
        super(masssage);
    }
}
