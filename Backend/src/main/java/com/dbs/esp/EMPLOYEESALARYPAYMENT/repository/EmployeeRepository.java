package com.dbs.esp.EMPLOYEESALARYPAYMENT.repository;

import com.dbs.esp.EMPLOYEESALARYPAYMENT.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> { }
