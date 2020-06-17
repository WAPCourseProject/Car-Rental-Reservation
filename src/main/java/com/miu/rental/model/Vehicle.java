package com.miu.rental.model;

import com.miu.rental.model.customAttributeType.BodyType;
import com.miu.rental.model.customAttributeType.FuelType;
import com.miu.rental.model.customAttributeType.Transmission;

import java.io.Serializable;

public class Vehicle  implements Serializable {
    private Integer vehicleId;
    private String make;//client searchable
    private String model;//client searchable
    private String type;//client searchable  // MADE CHANGES HERE TYPE ENUM TO STRING
    private String color;//client searchable
    private Integer year;//client searchable
    private Integer capacity;
    private Integer mileage;
    private String condition;//current assessment of its physical condition
    private String transmission;  //MADE CHANGES HERE TYPE ENUM TO STRING
    private String fuelType;  //MADE CHANGES HERE TYPE ENUM TO STRING
    private String plateNumber;
    private Double rentPrice;
    private Boolean available;
    private String imageUrl;

    private static Integer idCounter = 0;

    public Vehicle() {
        this.vehicleId = ++idCounter;
    }

    public Vehicle(String make, String model, String type, String color, Integer year, Integer capacity, Integer mileage, String condition, String transmission, String fuelType, String plateNumber, Double rentPrice, Boolean available) {
        this.vehicleId = ++idCounter;
        this.make = make;
        this.model = model;
        this.type = type.toUpperCase(); // MADE CHANGES HERE ON toUpperCase
        this.color = color;
        this.year = year;
        this.capacity = capacity;
        this.mileage = mileage;
        this.condition = condition;
        this.transmission = transmission.toUpperCase(); // MADE CHANGES HERE ON toUpperCase
        this.fuelType = fuelType.toUpperCase(); // MADE CHANGES HERE ON toUpperCase
        this.plateNumber = plateNumber;
        this.rentPrice = rentPrice;
        this.available = available;
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        //this.vehicleId = vehicleId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }          //MADE CHANGES HERE

    public void setType(String type) {
        this.type = type.toUpperCase();     //MADE CHANGES HERE
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public String getTransmission() {
        return transmission;
    } // MADE CHANGES HERE ON TYPE

    public void setTransmission(String transmission) {
        this.transmission = transmission.toUpperCase(); // MADE CHANGES HERE ON toUpperCase
    } // MADE CHANGES HERE ON TYPE

    public String getFuelType() {
        return fuelType;
    } // MADE CHANGES HERE ON TYPE

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType.toUpperCase();
    } // MADE CHANGES HERE ON TYPE and toUpperCase

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(Double rentPrice) {
        this.rentPrice = rentPrice;
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

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", type=" + type +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", capacity=" + capacity +
                ", mileage=" + mileage +
                ", condition='" + condition + '\'' +
                ", transmission=" + transmission +
                ", fuelType=" + fuelType +
                ", plateNumber='" + plateNumber + '\'' +
                ", rentPrice=" + rentPrice +
                ", available=" + available +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
