package com.miu.rental.controller;

import com.miu.rental.dao.ReservationRepository;
import com.miu.rental.dao.VehicleRepository;
import com.miu.rental.model.Vehicle;
import com.miu.rental.model.VehicleReservation;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet("/reservation-procced")
public class ReservationProccedController  extends HttpServlet {
    private ReservationRepository reservation;
    public ReservationProccedController(){
       this.reservation= new ReservationRepository();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer userID= (Integer)req.getSession().getAttribute("userID");
        String str=(String) req.getSession().getAttribute("vehicleId");
        Integer vehicleID=Integer.parseInt(str);
        // Integer vehicleID= (Integer)req.getSession().getAttribute("vehicleId");

        LocalDate startDate= LocalDate.of(Integer.parseInt("2020"),6,18);
        LocalDate endDate= LocalDate.of(Integer.parseInt("2020"),6,22);

        Vehicle vehicle = VehicleRepository.getById(vehicleID);
        req.setAttribute("vehicle",vehicle);

        reservation.addReservationByIds(userID,vehicleID, startDate, endDate);

        //resp.sendRedirect("/WEB-INF/summary.jsp");
        RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/summayPage.jsp");
        view.forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

}
