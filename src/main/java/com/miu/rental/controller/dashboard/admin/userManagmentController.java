package com.miu.rental.controller.dashboard.admin;

import com.miu.rental.dao.UserRepository;
import com.miu.rental.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;

@WebServlet("/admin/user_management")
public class userManagmentController extends HttpServlet {
    //    Gson mapper = new Gson();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<User> users = UserRepository.getAllUsers();

        req.setAttribute("users", users);
        RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/dashboard/admin/userManagment.jsp");
        view.forward(req, resp);
    }
}
