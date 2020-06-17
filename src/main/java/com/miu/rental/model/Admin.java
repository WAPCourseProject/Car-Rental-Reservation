package com.miu.rental.model;

import com.miu.rental.model.customAttributeType.Role;

import java.io.Serializable;

public class Admin extends User  implements Serializable {
    private String employeeId;

    public Admin() {
        super();
    }

    public Admin(String employeeId) {
        this.employeeId = employeeId;
    }

    public Admin(String fileName, String lastName, String userName, String password, String email, String role) { // MADE CHANGES HERE ROLL TYPLE
        super(fileName, lastName, userName, password, email, role);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
