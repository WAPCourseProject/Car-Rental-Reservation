package com.miu.rental.model;



public class Address {
    private Client owner;
    private String street;
    private String suiteNo;
    private String city;
    private String state;
    private String country;
    private Integer zipCode;

    public Address() {
    }

    public Address(Client owner, String street, String suiteNo, String city, String state, String country, Integer zipCode) {
        this.owner = owner;
        this.street = street;
        this.suiteNo = suiteNo;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuiteNo() {
        return suiteNo;
    }

    public void setSuiteNo(String suiteNo) {
        this.suiteNo = suiteNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }
}
