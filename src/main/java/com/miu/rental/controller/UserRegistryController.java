package com.miu.rental.controller;

import com.miu.rental.Util;
import com.miu.rental.dao.UserRepository;
import com.miu.rental.model.customAttributeType.Role;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class UserRegistryController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (!Util.isLoggedIn(req)) {
            RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/register.jsp");
            view.forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String error_message = Util.registrationValidation(req);
        if (error_message.equals("")) {
            String firstName = req.getParameter("inputFirstName");
            String lastName = req.getParameter("inputLastName");
            String userName = req.getParameter("inputUserName");
            String email = req.getParameter("inputEmailAddress");
            String password = req.getParameter("inputPassword");
            String conformPassword = req.getParameter("inputConfirmPassword");
            UserRepository.addUser(firstName, lastName, userName, password, email, "CLIENT");
            req.setAttribute("inputUserName",userName);
            req.setAttribute("inputPassword",password);
            RequestDispatcher view = req.getRequestDispatcher("/login");
            view.forward(req, resp);


        } else {
            req.setAttribute("error_message", error_message);

            RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/register.jsp");
            view.forward(req, resp);

        }


    }
}
