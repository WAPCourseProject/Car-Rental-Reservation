package com.miu.rental.dao;


import com.miu.rental.DataBaseConnection;
import com.miu.rental.model.admin.Vehicle;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class VehicleDAO {
    //private static ArrayList<Vehicle> vehicles = new ArrayList<>();

    Map<Integer, Vehicle> vehilces = new HashMap<>();

    {
        vehilces.put(1, new Vehicle(1,"Toyota", 2020,4,2080,"new","FT-345",350.0, true,"Black","rav4"));
        vehilces.put(2, new Vehicle(2,"Buick", 2019,4,2060,"new","FT-346",300.0, true,"Silver","Sedan"));
        vehilces.put(3, new Vehicle(3,"AlaphaRomeo", 2009,4,2000,"new","EFT-347",320.0, true,"RED","pickup"));
    }

    public void addVehicle(Vehicle vehicle){
        vehilces.put(vehicle.getId(), vehicle);
    }

    public void deleteVehicle(int vehicleId){
        vehilces.remove(vehicleId);
    }

    public void updateVehicle(Vehicle vehicle){
        vehilces.put(vehicle.getId(), vehicle);
    }

    public List<Vehicle> getAllVehicles(){
        return new ArrayList<>(vehilces.values());
    }

    public Vehicle getVehicleById(int vehicleId){
        return vehilces.get(vehicleId);
    }

    public int generateId() {
        return vehilces.size()+1;
    }


    public Boolean isEmpty(){
        if(vehilces.size()==0) return true;
        else return false;
    }

    public  Vehicle removeVehicleById(Integer id){
        if(isEmpty()) return null;
        for(int i = 0; i < vehilces.size(); i++){
            Vehicle vehicle = vehilces.get(i);
            if(vehicle.getId() == id){
                vehilces.remove(i);
                return vehicle;
            }
        }
        return null;
    }

    public Vehicle getVehicle(int id) {
        Vehicle vehicle = new Vehicle();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental", "root", "brocklife");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from carreserv where idcarreserv =" + id);
            if (rs.next()) {
                vehicle.setId(rs.getInt("idcarreserv"));
                vehicle.setMake(rs.getString("make"));

            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return vehicle;
    }

    public List<Vehicle> findAllCars() throws SQLException, ClassNotFoundException {
        List<Vehicle> vehicles = new ArrayList<>();
        Connection conn = DataBaseConnection.initializeDatabase();
        Statement myState = null;
        try {
            myState = conn.createStatement();
            String sql = "select * from carreserv";
            ResultSet rs = myState.executeQuery(sql);
            while (rs.next()) {
                Vehicle vehicle = new Vehicle();

                vehicle.setId(rs.getInt("idcarreserv"));
                vehicle.setMake(rs.getString("make"));
                vehicle.setModel(rs.getString("model"));
                vehicle.setColor(rs.getString("color"));
                vehicle.setCapacity(rs.getInt("capacity"));
                vehicle.setYear(rs.getInt("year"));
                vehicle.setCondition(rs.getString("condition"));
                vehicle.setMileage(rs.getInt("mileage"));
                vehicle.setRentPrice(rs.getDouble("price"));
                vehicle.setPlateNumber(rs.getString("plateNumber"));
                vehicle.setAvailable(rs.getBoolean("available"));
                vehicle.setModel(rs.getString("fueltype"));
                vehicles.add(vehicle);
            }
            conn.close();
            myState.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("finished");
        }
        return vehicles;
    }
    public void deleteVehicleById(int id)
    {
        try {
            Connection connection = DataBaseConnection.initializeDatabase();
            PreparedStatement pstmt = connection.prepareStatement("DELETE FROM `carrental`.carreserv WHERE  idcarreserv ='"+id+"'");
            pstmt.executeUpdate();
            pstmt.close();
            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println(e);
        }


    }
    public Vehicle saveVehicle(Vehicle vehicle)
    {
        try {
        Connection connection = DataBaseConnection.initializeDatabase();
            PreparedStatement pstmt = connection.prepareStatement("insert into `carrental`.carreserv (`make`, `model`,`color`, `capacity`, " +
                    "`year`,`condition`, `mileage`,`price`,`platenumber`,`available`,`fueltype`)" +
                    " values (?, ?, ?, ?, ?, ?, ?,?,?,?,?)");
            pstmt.setString(1, vehicle.getMake());
            pstmt.setString(2, vehicle.getModel());
            pstmt.setString(3, vehicle.getColor());
            pstmt.setInt(4, vehicle.getCapacity());
            pstmt.setInt(5, vehicle.getYear());
            pstmt.setString(6, vehicle.getCondition());
            pstmt.setInt(7, vehicle.getMileage());
            pstmt.setDouble(8, vehicle.getRentPrice());
            pstmt.setString(9, vehicle.getPlateNumber());
            pstmt.setBoolean(10, vehicle.getAvailable());
            pstmt.setString(11, vehicle.getImageUrl());
            pstmt.executeUpdate();
            System.out.println(pstmt.executeUpdate());
            pstmt.close();
            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println(e);
        }
        return vehicle;
    }

    public void updateVehicleByID(Vehicle vehicle)
    {
        try {
            Connection connection = DataBaseConnection.initializeDatabase();
            PreparedStatement pstmt = connection.prepareStatement("UPDATE  `carrental`.carreserv SET  make='"+vehicle.getMake()+"' , model='"+vehicle.getModel()+"' , color='"+vehicle.getColor()+"' , year ='"+vehicle.getYear()+"' , condition='"+vehicle.getCondition()+"' WHERE  id ='"+vehicle.getId()+"'");
            pstmt.executeUpdate();
            pstmt.close();
            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println(e);
        }

    }

}
