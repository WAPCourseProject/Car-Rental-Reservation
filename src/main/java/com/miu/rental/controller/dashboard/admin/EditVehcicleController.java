package com.miu.rental.controller.dashboard.admin;




import com.miu.rental.dao.VehicleDAO;
import com.miu.rental.model.admin.Vehicle;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/admin/edit")
public class EditVehcicleController extends HttpServlet {


    private static final long serialVersionUID = 1L;

    private VehicleDAO dao;

    public EditVehcicleController() {
        this.dao = new VehicleDAO();
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("vehicleId");
        System.out.println(id);
        Vehicle vehicle = dao.getVehicle(Integer.parseInt(id));
        req.setAttribute("getById", vehicle);


        RequestDispatcher dispacher = req.getRequestDispatcher("/WEB-INF/dashboard/admin/edit.jsp");
        dispacher.forward(req, resp);

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        String make = req.getParameter("make");
        String model = req.getParameter("model");
        String color = req.getParameter("color");
        int capacity = Integer.parseInt("capacity");
        int year = Integer.parseInt(req.getParameter("year"));
        String condition = req.getParameter("condition");
        int mileage = Integer.parseInt(req.getParameter("mileage"));
        Double price = Double.parseDouble("price");
        String platenumber = req.getParameter("platenumber");
        boolean available = Boolean.parseBoolean(req.getParameter("avaialable"));
        String imageUrl = req.getParameter("imageurl");


        Vehicle vehicle = new Vehicle(id, make, year, capacity, mileage, condition, platenumber,
                price, available, color,model);

        dao.updateVehicle(vehicle);
        System.out.println(vehicle.getRentPrice());
        RequestDispatcher dispacher = req.getRequestDispatcher("/admin/vehicle");
        dispacher.forward(req, resp);


    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*import com.miu.rental.dao.VehicleDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/admin/edit")
public class EditVehcicleController extends HttpServlet {



    private VehicleDAO dao;
    @Override
    public void init() throws ServletException {
        dao = new VehicleDAO();
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    {

        String idTemp = request.getParameter("id");
        int id = Integer.parseInt(idTemp);
        request.setAttribute("getById", dao.getVehicle(id));
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/dashboard/admin/edit.jsp");
        try {
            rd.forward(request, response);
        } catch (ServletException | IOException ex) {
            Logger.getLogger(EditVehcicleController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    *//**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     *//*
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    *//**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     *//*


}*/
