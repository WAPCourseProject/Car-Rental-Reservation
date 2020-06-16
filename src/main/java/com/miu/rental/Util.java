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
     if (req.getSession().getAttribute("userID")!=null){
         int userID= (int) req.getSession().getAttribute("userID");
         return UserRepository.getById(userID) != null;
     }
     return false;
    }

    public static boolean isAdmin(HttpServletRequest req) {
        if (req.getSession().getAttribute("userID")!=null){
            int userID= (int) req.getSession().getAttribute("userID");
            User user = UserRepository.getById(userID);
            assert user != null;
            return user.getRole()== Role.ADMIN;
        }
        return false;
    }


}
