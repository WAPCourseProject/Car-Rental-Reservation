package com.miu.rental.model;

import com.miu.rental.model.customAttributeType.*;

public class Client extends User{
    private String phoneNumber;
    private String licenceNumber;
    private String status; //active, frozen, premium

    public Client() {
        super();
    }

    public Client(String phoneNumber, String licenceNumber, String status) {
        this.phoneNumber = phoneNumber;
        this.licenceNumber = licenceNumber;
        this.status = status;
    }

    public Client(String fileName, String lastName, String userName, String password, String email, Enum<Role> role) {
        super(fileName, lastName, userName, password, email, role);
        this.status = "active";
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
