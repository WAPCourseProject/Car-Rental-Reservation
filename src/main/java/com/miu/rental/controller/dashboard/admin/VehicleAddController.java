package com.miu.rental.controller.dashboard.admin;


import com.google.gson.Gson;
import com.miu.rental.dao.VehicleDAO;
import com.miu.rental.dao.VehicleRepository;
import com.miu.rental.model.Vehicle;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * Servlet implementation class ProductController
 */
@WebServlet({"/admin/vehicle"})
public class VehicleAddController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private VehicleDAO dao;
    private VehicleRepository vehicleRepository;
    Gson mapper = new Gson();

    @Override
    public void init() throws ServletException {
        dao = new VehicleDAO();
        vehicleRepository = new VehicleRepository();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        request.setAttribute("vehicles", dao.getAllVehicles());
        request.setAttribute("vehicles", vehicleRepository.getAllVehicle());
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/dashboard/admin/vehicleadmin.jsp");
        view.forward(request, response);
        /*    try {
                request.setAttribute("vehicles", dao.findAllCars());
                RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/dashboard/admin/vehicleadmin.jsp");
                view.forward(request, response);
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
     }*/


    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

       /* String jsonSting = request.getParameter("vehicle");
        Vehicle vehicle = mapper.fromJson(jsonSting, Vehicle.class);

        //vehicle.setId(dao.generateId());
        vehicleRepository.addVehicle(vehicle);
        System.out.println(mapper.toJson(vehicle));
        PrintWriter out = response.getWriter();

        out.print(mapper.toJson(vehicle));*/

        String jsonSting = request.getParameter("vehicle");
        Vehicle vehicle = mapper.fromJson(jsonSting, Vehicle.class);

        //vehicle.setId(dao.generateId());
        vehicleRepository.addVehicle(vehicle);
        System.out.println(mapper.toJson(vehicle));
        PrintWriter out = response.getWriter();

        out.print(mapper.toJson(vehicle));
    }

}


