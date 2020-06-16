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

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/home.jsp");
        view.forward(req,resp);
    }
}
