package com.miu.rental;

import com.miu.rental.dao.UserRepository;
import com.miu.rental.model.User;
import com.miu.rental.model.customAttributeType.Role;

import javax.servlet.http.HttpServletRequest;

public class Util {
    public static boolean loginValidator(String userName, String password) {
        User user = UserRepository.getByUserName(userName);
        return user != null && user.getPassword().equals(password);
    }

    public static boolean isLoggedIn(HttpServletRequest req) {
        if (req.getSession().getAttribute("userID") != null) {
            int userID = (int) req.getSession().getAttribute("userID");
            return UserRepository.getById(userID) != null;
        }
        return false;
    }

    public static boolean isAdmin(HttpServletRequest req) {
        if (req.getSession().getAttribute("userID") != null) {
            int userID = (int) req.getSession().getAttribute("userID");
            User user = UserRepository.getById(userID);
            assert user != null;
            return user.getRole().equals("ADMIN");
        }
        return false;
    }

    public static String registrationValidation(HttpServletRequest req) {
        String firstName = req.getParameter("inputFirstName");
        String lastName = req.getParameter("inputLastName");
        String userName = req.getParameter("inputUserName");
        String email = req.getParameter("inputEmailAddress");
        String password = req.getParameter("inputPassword");
        String conformPassword = req.getParameter("inputConfirmPassword");
        String error_message = "";
        if (firstName.equals("") || lastName.equals("") || userName.equals("") || email.equals("") || password.equals("") || conformPassword.equals(""))
            error_message += " |*All Field are required";

        if (!password.equals(conformPassword))
            error_message += " |*Password didn't match";

        if (UserRepository.getByUserName(userName) != null)
            error_message += " |*user name exits ";
        return error_message;
    }


}
