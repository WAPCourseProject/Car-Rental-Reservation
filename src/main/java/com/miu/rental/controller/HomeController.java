package com.miu.rental.controller;

import com.miu.rental.dao.UserRepository;
import com.miu.rental.dao.VehicleRepository;
import com.miu.rental.model.customAttributeType.BodyType;
import com.miu.rental.model.customAttributeType.Role;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet({"/home",""})

public class HomeController extends HttpServlet {
    @Override
    public void init() throws ServletException {
        //super.init();
        System.out.println("Data Initialized");

        //Initialize User Repository
        UserRepository.addUser("Melakselam","Mengistu","Melak", "Melak123456","melak@gmail.com", "CLIENT");
        UserRepository.addUser("Bernabas","Demisse","Berni", "Berni123456","bernabas@gmail.com", "CLIENT");
        UserRepository.addUser("Brook","Legamo","BrookL", "Brook123456","brook@gmail.com", "CLIENT");
        UserRepository.addUser("Alemayoh","Abrha","Alex", "Alex123456","alex@gmail.com", "ADMIN");

        // MADE CHANGES HERE : TYPE OF 'type' TO STRING
        //Initialize Vehicle Repository
        VehicleRepository.addVehicle("12354dsdf","Toyota","Camry", "SEDAN", "black", 2000); // MADE CHANGES HERE CHANGED TYPE ARG
        VehicleRepository.addVehicle("12354dsdf","Toyota","Corolla", "SEDAN", "grey", 2016); // MADE CHANGES HERE CHANGED TYPE ARG
        VehicleRepository.addVehicle("12354dsdf","Tesla","Model X", "SUV", "silver-grey", 2020);// MADE CHANGES HERE CHANGED TYPE ARG
        VehicleRepository.addVehicle("12354dsdf","Subaru","WRX", "CONVERTABLE", "dark-blue", 2017);// MADE CHANGES HERE CHANGED TYPE ARG
        VehicleRepository.addVehicle("12354dsdf","Toyota","Yaris", "HATCHBACK", "blue", 2019);// MADE CHANGES HERE CHANGED TYPE ARG
        VehicleRepository.addVehicle("12354dsdf","Nissan","Altima", "SEDAN", "black", 2019);// MADE CHANGES HERE CHANGED TYPE ARG
        VehicleRepository.addVehicle("12354dsdf","Nissan","Titan XD", "PICKUP", "dark-grey", 2020);// MADE CHANGES HERE CHANGED TYPE ARG
        VehicleRepository.addVehicle("12354dsdf","Toyota","RAV4", "CROSSOVER", "white", 2020);// MADE CHANGES HERE CHANGED TYPE ARG
        VehicleRepository.addVehicle("12354dsdf","Tesla","Model S", "SEDAN", "burgundy", 2012);// MADE CHANGES HERE CHANGED TYPE ARG
        VehicleRepository.addVehicle("12354dsdf","Toyota","Prius", "SEDAN", "red", 2016);// MADE CHANGES HERE CHANGED TYPE ARG
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/home.jsp");
        view.forward(req,resp);
    }
}
