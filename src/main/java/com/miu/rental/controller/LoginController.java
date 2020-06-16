package com.miu.rental.controller;

import com.miu.rental.Util;
import com.miu.rental.dao.UserRepository;
import com.miu.rental.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (!Util.isLoggedIn(req)) {
            RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/login.jsp");
            view.forward(req, resp);
        }
        else {
            RequestDispatcher view = req.getRequestDispatcher("/dashboard");
            view.forward(req, resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

           String username = req.getParameter("inputUserName");
           String password = req.getParameter("inputPassword");
           String rememberPasswordCheck = req.getParameter("rememberPasswordCheck");
           if (Util.loginValidator(username, password)) {
               if (rememberPasswordCheck != null && rememberPasswordCheck.equals("remember")) {
                   Cookie c1 = new Cookie("userName", username);
                   Cookie c2 = new Cookie("password", password);
                   Cookie c3 = new Cookie("remember", "checked");
                   c1.setMaxAge(60 * 60);
                   c2.setMaxAge(60 * 60);
                   c3.setMaxAge(60 * 60);
                   resp.addCookie(c1);
                   resp.addCookie(c2);
                   resp.addCookie(c3);

               } else {
                   Cookie c1 = new Cookie("userName", null);
                   Cookie c2 = new Cookie("password", null);
                   Cookie c3 = new Cookie("remember", null);
                   c1.setMaxAge(0);
                   c2.setMaxAge(0);
                   c3.setMaxAge(0);
                   resp.addCookie(c1);
                   resp.addCookie(c2);
                   resp.addCookie(c3);
               }
               //Save On Session
               HttpSession session = req.getSession();
               User user = UserRepository.getByUserName(username);
               assert user != null;
               session.setAttribute("fullName", user.getFirstName() + " " + user.getLastName());
               session.setAttribute("userID", user.getUserId());
               //Redirect
               RequestDispatcher view = req.getRequestDispatcher("/dashboard");
               view.forward(req, resp);
           } else {
               req.setAttribute("error_message", "Wrong User Name or Password");

               RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/login.jsp");
               view.forward(req, resp);
           }

       }
}
