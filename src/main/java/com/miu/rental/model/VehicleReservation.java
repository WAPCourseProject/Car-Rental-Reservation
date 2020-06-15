package com.miu.rental.model;

import java.time.LocalDate;

public class VehicleReservation {
    private Integer userId;
    private Integer vehicleId;
    private LocalDate startDate;
    private LocalDate endDate;

    public VehicleReservation() {
    }

    public VehicleReservation(Integer userId, Integer vehicleId, LocalDate startDate, LocalDate endDate) {
        this.userId = userId;
        this.vehicleId = vehicleId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "VehicleReservation{" +
                "userId=" + userId +
                ", vehicleId=" + vehicleId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
