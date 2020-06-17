package com.miu.rental.controller;


import com.google.gson.Gson;
import com.miu.rental.dao.ReservationRepository;
import com.miu.rental.dao.UserRepository;
import com.miu.rental.dao.VehicleRepository;
import com.miu.rental.model.User;
import com.miu.rental.model.Vehicle;
import com.miu.rental.model.VehicleReservation;
import com.miu.rental.Util;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

@WebServlet("/reserve")
public class VehicleReservationController extends HttpServlet {

    Gson mapper = new Gson();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String str=(String) req.getSession().getAttribute("vehicleId");
        Integer vehicleID=Integer.parseInt(str);

       if (Util.isAdmin(req)) {
           RequestDispatcher view = req.getRequestDispatcher("/dashboard");
           view.forward(req, resp);
       }
       else {
           if (Util.isLoggedIn(req)){

            // int vehicleId= (int) req.getSession().getAttribute("vehicleId");
            // int userId= (int) req.getSession().getAttribute("userID");
            // Integer[] vehicleIDs = (Integer[]) req.getSession().getAttribute("vehicleIDs");

               Vehicle vehicle = VehicleRepository.getById(vehicleID);
               req.setAttribute("vehicle",vehicle);
//               if(vehicleIDs.length <= 0)
//                System.out.println("No Vehicle");
//               User user=UserRepository.getById(userId);
//
//               Vehicle vehicle = null;
//               String data = "[";
//               int i = 0;
//               int size = vehicleIDs.length;
//               for (Integer id: vehicleIDs) {
//                   vehicle = VehicleRepository.getById(id);
//                    data +=mapper.toJson(vehicle,Vehicle.class);
//                    i++;
//                    if(i<size){
//                        data+=",";
//                    }
//                 }
//               data += "]";
//               System.out.println(data);
//               req.setAttribute("user", user);
//               req.setAttribute("vehicles", data);

               //Pass to Reservation Process
               RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/reservationCheckout.jsp");
               view.forward(req, resp);
           }
           else {
               //Save selected Vehicle ... recommendation is Session
               //pass to login Process
               RequestDispatcher view = req.getRequestDispatcher("/login");
               view.forward(req, resp);
           }
       }

        System.out.println("Vehicle");

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}