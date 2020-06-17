package com.miu.rental.model.admin;


import com.miu.rental.model.customAttributeType.FuelType;
import com.miu.rental.model.customAttributeType.Transmission;

public class Vehicle {
    private int id;
    private String make;
    private Integer year;
    private Integer capacity;
    private Integer mileage;
    private String condition;//current assessment of its physical condition
    private Enum<Transmission> transmission;
    private Enum<FuelType> fuelType;
    private String plateNumber;

    public Double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(Double rentPrice) {
        this.rentPrice = rentPrice;
    }

    private Double rentPrice;
    private Boolean available;
    private String imageUrl;
    private String model;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    private String color;

    public Vehicle() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Enum<Transmission> getTransmission() {
        return transmission;
    }

    public void setTransmission(Enum<Transmission> transmission) {
        this.transmission = transmission;
    }

    public Enum<FuelType> getFuelType() {
        return fuelType;
    }

    public void setFuelType(Enum<FuelType> fuelType) {
        this.fuelType = fuelType;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }





    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Vehicle(int id, String make, Integer year, Integer capacity, Integer mileage, String condition, String plateNumber,
                   Double rentPrice, Boolean available, String color,String model) {
        this.id = id;
        this.make = make;
        this.year = year;
        this.capacity = capacity;
        this.mileage = mileage;
        this.condition = condition;
        this.plateNumber = plateNumber;
       this.rentPrice = rentPrice;
        this.available = available;
        this.color = color;
        this.model =model;
    }

    public Vehicle(int id, String make, String color) {
        super();
        this.id = id;
        this.make = make;
        this.color = color;
    }

    public Vehicle(String make, String color) {
        super();
        this.make = make;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

   /* @Override
    public String toString() {
        return "Vehicle{" +
                "idcarreserv='" + id + '\'' +
                ", make='" + make + '\'' +
                ", color='" + color + '\'' +
                ",transmission='" +transmission + '\'' +
                ",mileage='" + mileage + '\'' +
                ", year='" + year + '\'' +
                ", price='" + rentPrice+ '\'' +
                ", plateNumber='" + plateNumber + '\'' +
                ",capacity='" + capacity + '\'' +
                ", fuelType='" +fuelType + '\'' +
                ", model='" + model  + '\'' +
                '}';
    }*/

}
