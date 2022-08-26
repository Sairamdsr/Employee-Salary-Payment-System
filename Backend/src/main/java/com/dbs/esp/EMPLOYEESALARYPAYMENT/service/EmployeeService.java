package com.dbs.esp.EMPLOYEESALARYPAYMENT.service;

import com.dbs.esp.EMPLOYEESALARYPAYMENT.exception.EmployeeNotFoundException;
import com.dbs.esp.EMPLOYEESALARYPAYMENT.model.Employee;
import com.dbs.esp.EMPLOYEESALARYPAYMENT.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee employeeDetails(int employeeId) throws EmployeeNotFoundException {

        Optional<Employee> employee = employeeRepository.findById(employeeId);
        if (employee.isEmpty()) throw new EmployeeNotFoundException("Invalid Employee Id");

        return employee.get();

    }

    public List<Employee> allEmployeeDetails() {

        return employeeRepository.findAll();

    }

}
