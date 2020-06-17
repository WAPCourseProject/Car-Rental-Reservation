package com.miu.rental.dao;

import com.miu.rental.model.Vehicle;
import com.miu.rental.model.customAttributeType.BodyType;

import java.io.Serializable;
import java.util.ArrayList;

public class VehicleRepository implements Serializable {
    private static ArrayList<Vehicle> vehicles = new ArrayList<>();
    private ArrayList<Vehicle> subList;

    public VehicleRepository() {
        super();
    }
    public VehicleRepository(ArrayList<Vehicle> filteredList){
        subList = filteredList;
    }

    public static Boolean isEmpty(){
        if(vehicles.size()==0) return true;
        else return false;
    }
    public static ArrayList<Vehicle> getAllVehicle(){
        return vehicles;
    }

    public static Vehicle getById(Integer id){
        if(!isEmpty()){
            for(Vehicle vehicle: vehicles){
                if(vehicle.getVehicleId() == id){
                    return vehicle;
                }
            }
        }
        return null;
    }

    public static ArrayList<Vehicle> getAllVehicles(){ // MADE CHANGES HERE ADDED

        return vehicles;
    }

    ///////////////////// TO START CHAIN FILTERING /////////////////////
    public static ArrayList<Vehicle> getByMake(String make){
        ArrayList<Vehicle> filteredList = new ArrayList<>();

        if(!isEmpty()){
            for(Vehicle vehicle: vehicles){
                if(vehicle.getMake().compareTo(make) == 0){
                    filteredList.add(vehicle);
                }
            }
            return filteredList;
        }
        return null;
    }

    public static ArrayList<Vehicle> getByMakeModel(String make, String model){
        ArrayList<Vehicle> filteredList = new ArrayList<>();

        if(!isEmpty()){
            for(Vehicle vehicle: vehicles){
                if(vehicle.getMake().compareTo(make) == 0 && vehicle.getModel().compareTo(model) == 0){
                    filteredList.add(vehicle);
                }
            }
            return filteredList;
        }
        return null;
    }

    public static ArrayList<Vehicle> getByColor(String color){
        ArrayList<Vehicle> filteredList = new ArrayList<>();

        if(!isEmpty()){
            for(Vehicle vehicle: vehicles){
                if(vehicle.getColor().compareTo(color) == 0){
                    filteredList.add(vehicle);
                }
            }
            return filteredList;
        }
        return null;
    }

    ///////////////////// FOR CHAIN FILTERING /////////////////////
    public ArrayList<Vehicle> getFromSubListByMake(String make){
        ArrayList<Vehicle> filteredList = new ArrayList<>();

        if(subList.size() != 0){
            for(Vehicle vehicle: subList){
                if(vehicle.getMake().compareTo(make) == 0){
                    filteredList.add(vehicle);
                }
            }
            return filteredList;
        }
        return null;
    }

    public ArrayList<Vehicle> getFromSubListByMakeModel(String make, String model){
        ArrayList<Vehicle> filteredList = new ArrayList<>();

        if(subList.size() != 0){
            for(Vehicle vehicle: subList){
                if(vehicle.getMake().compareTo(make) == 0 && vehicle.getModel().compareTo(model) == 0){
                    filteredList.add(vehicle);
                }
            }
            return filteredList;
        }
        return null;
    }

    public ArrayList<Vehicle> getFromSubListByColor(String color){
        ArrayList<Vehicle> filteredList = new ArrayList<>();

        if(subList.size() != 0){
            for(Vehicle vehicle: subList){
                if(vehicle.getColor().compareTo(color) == 0){
                    filteredList.add(vehicle);
                }
            }
            return filteredList;
        }
        return null;
    }

    public ArrayList<Vehicle> getFromSubListByType(BodyType type){
        ArrayList<Vehicle> filteredList = new ArrayList<>();

        if(subList.size() != 0){
            for(Vehicle vehicle: subList){
                if(vehicle.getType().compareTo(type.name()) == 0){  //MADE CHANGES HERE
                    filteredList.add(vehicle);
                }
            }
            return filteredList;
        }
        return null;
    }

    public ArrayList<Vehicle> getFromSubListByYear(Integer year){
        ArrayList<Vehicle> filteredList = new ArrayList<>();

        if(subList.size() != 0){
            for(Vehicle vehicle: subList){
                if(vehicle.getYear().equals(year)){
                    filteredList.add(vehicle);
                }
            }
            return filteredList;
        }
        return null;
    }
    ///////////////////// FOR CHAIN FILTERING END /////////////////////


    public static Boolean addVehicle(String plateNo, String make, String model, String type, String color, Integer year) {  // MADE CHANGES HERE ON TYPE OF 'type'
        vehicles.add(new Vehicle(make, model, type, color, year, 0, 0, null, "", "", plateNo, 0.0, true)); // MADE CHANGES HERE SET NULL VALUE INITIALIZERS OF TRANSMITION AND FUELTYP TO ""
        return true;
    }

    public static  Boolean addVehicle(String make, Integer year, Integer capacity, Integer mileage, String condition, String plateNumber,
                                      Double rentPrice, Boolean available, String color,String model, String imgURL){

        vehicles.add(new Vehicle(make, year, capacity, mileage, condition,plateNumber,rentPrice,available,color,model,imgURL));

        return  true;
    }
    public static  Boolean addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);

          return  true;
    }


    public static Vehicle removeVehicleById(Integer id){
        if(isEmpty()) return null;
        for(int i = 0; i < vehicles.size(); i++){
            Vehicle vehicle = vehicles.get(i);
            if(vehicle.getVehicleId() == id){
                vehicles.remove(i);
                return vehicle;
            }
        }
        return null;
    }


    public static Vehicle removeVehicleByPlate(Integer id){
        if(isEmpty()) return null;
        for(int i = 0; i < vehicles.size(); i++){
            Vehicle vehicle = vehicles.get(i);
            if(vehicle.getVehicleId() == id){
                vehicles.remove(i);
                return vehicle;
            }
        }
        return null;
    }


}
