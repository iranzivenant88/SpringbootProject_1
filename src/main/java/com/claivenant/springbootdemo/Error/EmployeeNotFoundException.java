package com.claivenant.springbootdemo.Error;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(String message){
        super(message);

    }
}
