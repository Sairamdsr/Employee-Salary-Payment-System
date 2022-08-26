package com.dbs.esp.EMPLOYEESALARYPAYMENT.model;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @Column(name = "employee_id")
    private int employeeId;

    private String employeeName;
    private String businessUnit;
    @ManyToOne
    @JoinColumn(name = "department_name")
    private Department department;
    @ManyToOne
    @JoinColumn(name = "team_name")
    private Team team;
    private float salary;

    public Employee() { super(); }

    public Employee(int employeeId, String employeeName, String businessUnit, Department department, Team team, float salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.businessUnit = businessUnit;
        this.department = department;
        this.team = team;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
