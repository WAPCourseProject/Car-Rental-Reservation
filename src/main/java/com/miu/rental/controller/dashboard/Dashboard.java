package com.miu.rental.controller.dashboard;

import com.miu.rental.Util;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/dashboard")
public class Dashboard extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        toDashbord(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        toDashbord(req, resp);

    }

    private void toDashbord(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(Util.isLoggedIn(req)){
            RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/dashboard/dashboard.jsp");
            view.forward(req, resp);
        }else {
            RequestDispatcher view = req.getRequestDispatcher("/login");
            view.forward(req, resp);
        }

         }

}
