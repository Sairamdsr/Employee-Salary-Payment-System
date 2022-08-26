package com.dbs.esp.EMPLOYEESALARYPAYMENT.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

    @Id
    private int departmentId;
    private String departmentName;

    public Department() { super(); }

    public Department(String departmentName) {

        super();
        this.departmentName = departmentName;

    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
