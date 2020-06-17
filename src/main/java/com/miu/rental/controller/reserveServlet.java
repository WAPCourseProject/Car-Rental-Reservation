package com.miu.rental.controller;

import com.miu.rental.Util;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/requestReserve")
public class reserveServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String vehicleId = request.getParameter("vehicleId");
        request.getSession().setAttribute("vehicleId",vehicleId);
        System.out.println(vehicleId);
//        if (Util.isAdmin(request)){
//            RequestDispatcher view = request.getRequestDispatcher("/dashboard");
//            view.forward(request,response);
//        }else {
//            if (Util.isLoggedIn(request)){
//
//            }else {
//                //
//            }
//        }
//        response.getWriter().print("{\"url\":\"requestReserve\"}");

        response.getWriter().print("{\"url\":\"reserve\"}");
//
//        RequestDispatcher view = request.getRequestDispatcher("/reserve");
//        view.forward(request,response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Get");
//        RequestDispatcher view = request.getRequestDispatcher("/reserve");
//        view.forward(request,response);
    }
}
