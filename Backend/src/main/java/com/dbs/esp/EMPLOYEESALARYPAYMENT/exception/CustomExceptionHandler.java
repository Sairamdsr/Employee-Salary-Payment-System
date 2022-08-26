package com.dbs.esp.EMPLOYEESALARYPAYMENT.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(value = EmployeeNotFoundException.class)
    public ResponseEntity<ErrorResponse> meth1(EmployeeNotFoundException employeeNotFoundException) {

        HttpStatus httpStatus = HttpStatus.NOT_FOUND;
        String message = employeeNotFoundException.getMessage();
        ErrorResponse errorResponse = new ErrorResponse(httpStatus, message);
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

}
