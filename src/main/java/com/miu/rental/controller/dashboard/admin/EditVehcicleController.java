package com.miu.rental.controller.dashboard.admin;


import com.miu.rental.dao.VehicleDAO;
import com.miu.rental.dao.VehicleRepository;
import com.miu.rental.model.Vehicle;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/admin/edit")
public class EditVehcicleController extends HttpServlet {


    private static final long serialVersionUID = 1L;

    private VehicleDAO dao;
    private VehicleRepository vehicleRepository;

    /*public EditVehcicleController() {
        this.dao = new VehicleDAO();
        this.vehicleRepository = new VehicleRepository();
    }*/
    @Override
    public void init() throws ServletException {
        this.dao = new VehicleDAO();
        this.vehicleRepository = new VehicleRepository();
    }




    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("vehicleId");
        System.out.println(id);
//        Vehicle vehicle = dao.getVehicle(Integer.parseInt(id));
        Vehicle vehicle = vehicleRepository.getById(Integer.parseInt(id));
        HttpSession session = req.getSession();
//        session.setAttribute("getById", vehicle);
//        resp.sendRedirect("/WEB-INF/dashboard/admin/edit.jsp");

        req.setAttribute("getById", vehicle);


        RequestDispatcher dispacher = req.getRequestDispatcher("/WEB-INF/dashboard/admin/edit.jsp");
        dispacher.forward(req, resp);

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("vehicleId");
        Integer carId = Integer.parseInt(id);
        String condition = req.getParameter("condition");
        boolean available = Boolean.parseBoolean(req.getParameter("avaialable"));

        vehicleRepository.modifyVehicleById(carId, condition, available);
        resp.sendRedirect("vehicle");



    }
}


