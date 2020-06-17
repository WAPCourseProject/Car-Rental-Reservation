package com.miu.rental.dao;

import com.miu.rental.model.Client;
import com.miu.rental.model.VehicleReservation;
import com.miu.rental.model.Vehicle;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class ReservationRepository implements Serializable {
    private static ArrayList <VehicleReservation> reservations = new ArrayList<>();

    public static Boolean isEmpty(){
        if(reservations.size()==0) return true;
        else return false;
    }

    public static ArrayList<VehicleReservation> getAllReservations(){ // MADE CHANGES HERE ADDED
        return reservations;
    }

    public static Integer getReservationIndx (Integer clientId, Integer vehicleId, LocalDate start, LocalDate end){

        if(isEmpty()) return null;

        for(int i = 0; i < reservations.size(); i++){
            VehicleReservation thisReservation = reservations.get(i);
            if(thisReservation.getUserId() == clientId && thisReservation.getVehicleId() == vehicleId &&
                    thisReservation.getStartDate().compareTo(start) == 0 && thisReservation.getEndDate().compareTo(end) == 0
            ){
                return i;
            }
        }
        return null;
    }

    public static VehicleReservation getReservation (Integer clientId, Integer vehicleId, LocalDate start, LocalDate end){

        if(isEmpty()) return null;

        for(int i = 0; i < reservations.size(); i++){
            VehicleReservation thisReservation = reservations.get(i);
            if(thisReservation.getUserId() == clientId && thisReservation.getVehicleId() == vehicleId &&
                    thisReservation.getStartDate().compareTo(start) == 0 && thisReservation.getEndDate().compareTo(end) == 0
            ){
                return thisReservation;
            }
        }
        return null;
    }

    public static ArrayList<Integer> getReservationIndicesByClientId(Integer clientId){
        if(isEmpty()) return null;
        ArrayList<Integer> reservationIndices = new ArrayList<>();
        for(int i = 0; i < reservations.size(); i++){
            VehicleReservation thisReservation = reservations.get(i);
            if(thisReservation.getUserId() == clientId ){
                reservationIndices.add(i);
            }
        }
        return reservationIndices;
    }

    public static ArrayList<Integer> getReservationIndicesByVehicleId(Integer vehicleId){
        if(isEmpty()) return null;
        ArrayList<Integer> reservationIndices = new ArrayList<>();
        for(int i = 0; i < reservations.size(); i++){
            VehicleReservation thisReservation = reservations.get(i);
            if(thisReservation.getVehicleId() == vehicleId ){
                reservationIndices.add(i);
            }
        }
        return reservationIndices;
    }

    public static VehicleReservation getReservationByIndex(Integer indx){
        if(!isEmpty() && (indx >= 0 && indx < reservations.size())){
            return reservations.get(indx);
        }else return null;
    }

    public static ArrayList<VehicleReservation> getAllReservationsByClientId(Integer id){
        if(!isEmpty()){
            ArrayList<VehicleReservation> clientsReservations = new ArrayList<>();
            for(VehicleReservation reservation: reservations){
                if(reservation.getUserId() == id){
                    clientsReservations.add(reservation);
                }
            }
            return clientsReservations;
        }else return null;
    }

    public static ArrayList<VehicleReservation> getAllReservationsByVehicleId(Integer id){
        if(!isEmpty()){
            ArrayList<VehicleReservation> reservationsOfVehicle = new ArrayList<>();
            for(VehicleReservation reservation: reservations){
                if(reservation.getVehicleId() == id){
                    reservationsOfVehicle.add(reservation);
                }
            }
            return reservationsOfVehicle;
        }else return null;
    }

    public static ArrayList<VehicleReservation> getAllReservationsByClientVehicleIds(Integer clientId, Integer vehicleId){
        if(!isEmpty()){
            ArrayList<VehicleReservation> reserves = new ArrayList<>();
            for(VehicleReservation reservation: reservations){
                if(reservation.getUserId() == clientId && reservation.getVehicleId() == vehicleId){
                    reserves.add(reservation);
                }
            }
            return reserves;
        }else return null;
    }


    //must be supplied with existing ids of client and vehicle from respective repositories
    public static void addReservationByIds(Integer clientId, Integer vehicleId, LocalDate startDate, LocalDate endDate){
        try {
            ArrayList<VehicleReservation> res = getAllReservationsByVehicleId(vehicleId); //retrives all reservations of the selected vehicle
            if(res == null) {
                reservations.add(new VehicleReservation(clientId, vehicleId, startDate, endDate));
            } else {
                for(VehicleReservation reservation : res) { //for each found reservation of the vehicle this checks if the new reservation would overlap

                    LocalDate foundStart = reservation.getStartDate();
                    LocalDate foundEnd = reservation.getEndDate();

                    if ((foundStart == startDate || foundEnd == endDate) || //either start dates or end dates or both coincide
                            (foundStart.compareTo(startDate) > 0 && foundStart.compareTo(endDate) < 0) || //foundStart is between startDate and endDate
                            (foundEnd.compareTo(startDate) > 0 && foundEnd.compareTo(endDate) < 0) || //foundEnd is between StartDate and endDate
                            (foundStart.compareTo(startDate) < 0 && foundEnd.compareTo(endDate) > 0) // new date range lies within the existing date range
                    ) {
                        throw new Exception(); //there is an existing reservation with an overlapping reservation for the same date range
                    }
                }
            }
        }catch (Exception e){
            System.out.println("vehicle reservation for these dates coincides with an already existing reservation");
        }
    }

    //must be supplied with existing client and vehicle from respective repositories
    public static void addReservation(Client client, Vehicle vehicle, LocalDate startDate, LocalDate endDate){
        addReservationByIds(client.getUserId(), vehicle.getVehicleId(), startDate, endDate);
    }

    public static VehicleReservation removeFirstReservation(Integer clientId, Integer vehicleId){

        if(isEmpty()) return null;

        for(int i = 0; i < reservations.size(); i++){
            VehicleReservation thisReservation = reservations.get(i);
            if(thisReservation.getUserId() == clientId && thisReservation.getVehicleId() == vehicleId){
                reservations.remove(i);
                return thisReservation;
            }
        }
        return null;
    }

    public static void removeAllReservationClientVehicle(Integer clientId, Integer vehicleId){

        if(isEmpty()) return;

        for(int i = 0; i < reservations.size(); i++){
            VehicleReservation thisReservation = reservations.get(i);
            if(thisReservation.getUserId() == clientId && thisReservation.getVehicleId() == vehicleId){
                reservations.remove(i);
            }
        }
    }

    public static void removeAReservation(Integer clientId, Integer vehicleId, LocalDate start, LocalDate end){

        if(isEmpty()) return;
        Integer indx = getReservationIndx(clientId,vehicleId, start,end);
        if(indx != null) {
            reservations.remove(indx);
        }
    }

    public static void removeReservationByIndx(Integer indx) {

        if (isEmpty()) return;

        if (indx >= 0 && indx < reservations.size())
            reservations.remove(indx);
    }

    public static Boolean modifyReservationByIndx(Integer indx, LocalDate start, LocalDate end) {

        if (isEmpty()) return false;

        if (indx >= 0 && indx < reservations.size()) {
            VehicleReservation reservation = reservations.get(indx);
            reservation.setStartDate(start);
            reservation.setEndDate(end);
            return true;
        }else return false;

    }

    public static Boolean modifyReservation(Integer clientId, Integer vehicleId, LocalDate start, LocalDate end, LocalDate newStart, LocalDate newEnd) {

        if (isEmpty()) return false;

        VehicleReservation reservation = getReservation(clientId,vehicleId,start,end);
        if(reservation != null){
            reservation.setStartDate(start);
            reservation.setEndDate(end);
            return true;
        }else return false;

    }



}