package com.miu.rental.controller;

import com.miu.rental.dao.UserRepository;
import com.miu.rental.dao.VehicleRepository;
import com.miu.rental.model.customAttributeType.BodyType;
import com.miu.rental.model.customAttributeType.Role;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RepositoryServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        //super.init();
        System.out.println("RS: Init");

        //Initialize User Repository
        UserRepository.addUser("Melakselam","Mengistu","Melak", "Melak123456","melak@gmail.com", Role.CLIENT);
        UserRepository.addUser("Bernabas","Demisse","Berni", "Berni123456","bernabas@gmail.com", Role.CLIENT);
        UserRepository.addUser("Brook","Legamo","BrookL", "Brook123456","brook@gmail.com", Role.CLIENT);
        UserRepository.addUser("Alemayoh","Abrha","Alex", "Alex123456","alex@gmail.com", Role.ADMIN);

        //Initialize Vehicle Repository
        VehicleRepository.addVehicle("12354dsdf","Toyota","Camry", BodyType.SEDAN, "black", 2000);
        VehicleRepository.addVehicle("12354dsdf","Toyota","Corolla", BodyType.SEDAN, "grey", 2016);
        VehicleRepository.addVehicle("12354dsdf","Tesla","Model X", BodyType.SUV, "silver-grey", 2020);
        VehicleRepository.addVehicle("12354dsdf","Subaru","WRX", BodyType.CONVERTABLE, "dark-blue", 2017);
        VehicleRepository.addVehicle("12354dsdf","Toyota","Yaris", BodyType.HATCHBACK, "blue", 2019);
        VehicleRepository.addVehicle("12354dsdf","Nissan","Altima", BodyType.SEDAN, "black", 2019);
        VehicleRepository.addVehicle("12354dsdf","Nissan","Titan XD", BodyType.PICKUP, "dark-grey", 2020);
        VehicleRepository.addVehicle("12354dsdf","Toyota","RAV4", BodyType.CROSSOVER, "white", 2020);
        VehicleRepository.addVehicle("12354dsdf","Tesla","Model S", BodyType.SEDAN, "burgundy", 2012);
        VehicleRepository.addVehicle("12354dsdf","Toyota","Prius", BodyType.SEDAN, "red", 2016);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fname = request.getParameter("n1");
        String lname = request.getParameter("n2");
        String uname = request.getParameter("n3");
        String pass = request.getParameter("n4");
        String email = "adm123@gmail.com";
        Role roll = Role.ADMIN;
        System.out.println(fname);
        UserRepository.addUser(fname,lname,uname,pass,email,roll);
//        response.getWriter().println(VehicleRepository.removeVehicleById(1).toString());
//        response.getWriter().println(UserRepository.getById(5).toString());
//        response.getWriter().println(VehicleRepository.getById(5).toString());
//        response.getWriter().println(VehicleRepository.getByMake("Toyota").toString());
//        response.getWriter().println(VehicleRepository.getByMakeModel("Toyota", "Camry").toString());
//        response.getWriter().println(VehicleRepository.getByColor("black").toString());
//        response.getWriter().println(UserRepository.getById(3).getUserName());
//        response.getWriter().println(UserRepository.getByUserName("Melak").getPassword());
//        response.getWriter().println(UserRepository.removeUserById(3).getFirstName());

//        ReservationRepository.addReservation((Client)UserRepository.getByRole(Role.CLIENT).get(0),VehicleRepository.removeVehicleById(7),LocalDate.of(2020,7,18), LocalDate.of(2020,8,12));
//        response.getWriter().println(ReservationRepository.getReservationByIndex(0).toString());

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
