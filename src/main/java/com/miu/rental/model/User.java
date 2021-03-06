package com.miu.rental.model;

import com.miu.rental.model.customAttributeType.Role;

import java.io.Serializable;

public abstract class User  implements Serializable {
    private Integer userId;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;
    private String role; // MADE CHANGES HERE ON TYPE

    private static Integer idCounter= 0;

    public User() {
        this.userId = ++idCounter;
    }

    public User(String firstName, String lastName, String userName, String password, String email, String role) { // MADE CHANGES HERE ON TYPE
        this.userId = ++idCounter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.role = role.toUpperCase(); // MADE CHANGES HERE ON toUpperCase
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        //this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fileName) {
        this.firstName = fileName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    } // MADE CHANGES HERE ON TYPE

    public void setRole(String role) {
        this.role = role.toUpperCase();
    } // MADE CHANGES HERE ON TYPE

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                '}';
    }
}
