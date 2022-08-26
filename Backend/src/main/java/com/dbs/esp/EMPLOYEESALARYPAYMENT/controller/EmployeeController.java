package com.dbs.esp.EMPLOYEESALARYPAYMENT.controller;

import com.dbs.esp.EMPLOYEESALARYPAYMENT.exception.EmployeeNotFoundException;
import com.dbs.esp.EMPLOYEESALARYPAYMENT.model.Employee;
import com.dbs.esp.EMPLOYEESALARYPAYMENT.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("dbs/")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("employee/{employeeId}")
    public ResponseEntity<Employee> employeeDetails(@PathVariable("employeeId") int employeeId) throws EmployeeNotFoundException {

        Employee employee = employeeService.employeeDetails(employeeId);

        return new ResponseEntity<>(employee, HttpStatus.OK);

    }

    @GetMapping("employees")
    public ResponseEntity<List<Employee>> allEmployeeDetails() {

        List<Employee> employees = employeeService.allEmployeeDetails();

        return new ResponseEntity<>(employees, HttpStatus.OK);

    }

}
