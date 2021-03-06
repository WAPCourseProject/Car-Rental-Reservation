package com.miu.rental.controller.dashboard.admin;


import com.miu.rental.dao.VehicleDAO;
import com.miu.rental.dao.VehicleRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin/deleteVehicle")
public class DeleteCar extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private VehicleDAO dao;
    private VehicleRepository vehicleRepository;

    public DeleteCar() {
        this.dao = new VehicleDAO();
        this.vehicleRepository = new VehicleRepository();
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        doPost(req, resp);
        String id = req.getParameter("vehicleId");
        Integer carId = Integer.parseInt(id);
        System.out.println(carId);
        // use this one alternative
//        dao.deleteVehicleById(carId);
        vehicleRepository.removeVehicleById(carId);
        resp.sendRedirect("vehicle");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /*String id = req.getParameter("id");

        dao.deleteVehicleById(Integer.parseInt(id));
        RequestDispatcher dispacher = req.getRequestDispatcher("/admin/vehicle");
        dispacher.forward(req, resp);*/


    }


}