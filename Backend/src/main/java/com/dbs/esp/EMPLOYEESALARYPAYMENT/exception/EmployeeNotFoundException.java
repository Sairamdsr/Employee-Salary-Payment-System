package com.dbs.esp.EMPLOYEESALARYPAYMENT.exception;

public class EmployeeNotFoundException extends Exception {

    public EmployeeNotFoundException() { super(); }

    public EmployeeNotFoundException(String exception) { super(exception); }

    public EmployeeNotFoundException(Exception exception) { super(exception); }

}