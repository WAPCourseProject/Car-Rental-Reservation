package com.miu.rental.model;

import com.miu.rental.model.customAttributeType.BodyType;
import com.miu.rental.model.customAttributeType.FuelType;
import com.miu.rental.model.customAttributeType.Transmission;

public class Vehicle {
    private Integer vehicleId;
    private String make;
    private String model;
    private Enum<BodyType> type;
    private String color;
    private Integer year;
    private Integer capacity;
    private Integer mileage;
    private String condition;//current assessment of its physical condition
    private Enum<Transmission> transmission;
    private Enum<FuelType> fuelType;
    private String plateNumber;
    private Double rentPrice;
    private Boolean available;
    private String imageUrl;

    private static Integer idCounter = 0;

    public Vehicle() {
        this.vehicleId = ++idCounter;
    }

    public Vehicle(String make, String model, Enum<BodyType> type, String color, Integer year, Integer capacity, Integer mileage, String condition, Enum<Transmission> transmission, Enum<FuelType> fuelType, String plateNumber, Double rentPrice, Boolean available) {
        this.vehicleId = ++idCounter;
        this.make = make;
        this.model = model;
        this.type = type;
        this.color = color;
        this.year = year;
        this.capacity = capacity;
        this.mileage = mileage;
        this.condition = condition;
        this.transmission = transmission;
        this.fuelType = fuelType;
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

    public Enum<BodyType> getType() {
        return type;
    }

    public void setType(Enum<BodyType> type) {
        this.type = type;
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

    /////////////////////// ADDED FROM b2 repo
    public Vehicle( String make, Integer year, Integer capacity, Integer mileage, String condition, String plateNumber,
                   Double rentPrice, Boolean available, String color,String model) {
        this.vehicleId = ++idCounter;
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

    public  Vehicle (String make, Integer year, Integer capacity, Integer mileage, String condition, String plateNumber,
                     Double rentPrice, Boolean available, String color,String model, String imgURL){
        this.vehicleId = ++idCounter;
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
        this.imageUrl =imgURL;

    }
}
