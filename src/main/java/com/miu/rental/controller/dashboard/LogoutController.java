package com.miu.rental.controller.dashboard;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet({"/logout","/admin/logout","/user/logout"})
public class LogoutController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().removeAttribute("fullName");
        req.getSession().removeAttribute("userID");
        RequestDispatcher view = req.getRequestDispatcher("/home");
        view.forward(req,resp);
    }
}
