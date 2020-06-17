package com.miu.rental.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/blank_front")
public class balnk_front extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String str=(String) req.getSession().getAttribute("vehicleId");
        System.out.println(str);
        RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/blank_front.jsp");
        view.forward(req,resp);
    }
}
