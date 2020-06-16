package com.miu.rental.dao;

import com.miu.rental.model.Admin;
import com.miu.rental.model.Client;
import com.miu.rental.model.User;
import com.miu.rental.model.customAttributeType.Role;

import java.util.ArrayList;

public class UserRepository {
    private static ArrayList<User> users = new ArrayList<>();


    public static Boolean isEmpty(){
        if(users.size()==0) return true;
        else return false;
    }

    public static User getById(Integer id){
        if(!isEmpty()){
            for(User user: users){
                if(user.getUserId().equals(id)){
                    return user;
                }
            }
        }
        return null;
    }

    public static User getByUserName(String userName){
        if(!isEmpty()){
            for(User user: users){
                if(user.getUserName().compareTo(userName) == 0){
                    return user;
                }
            }
        }
        return null;
    }

    public static ArrayList<User> getByRole(Role role){
        if(!isEmpty()){
            ArrayList<User> filteredUsers = new ArrayList<>();
            for(User user: users){
                if(user.getRole().compareTo(role) == 0){
                    filteredUsers.add(user);
                }
            }
            return filteredUsers;
        }
        return null;
    }

    public static Boolean addUser(String firstName, String lastName, String userName, String password, String email, Enum<Role> role) {
        if(role.compareTo(Role.ADMIN) == 0){
        users.add(new Admin(firstName, lastName, userName, password, email, role));
        return true;
        }else if(role.compareTo(Role.CLIENT) == 0){
            users.add(new Client(firstName, lastName, userName, password, email, role));
            return true;}
        return false;
    }

    public static User removeUserById(Integer id) {
        if (!isEmpty()) {
            for (int i = 0; i < users.size(); i++) {
                User user = users.get(i);
                if (user.getUserId().equals(id)) {
                    users.remove(i);
                    return user;
                }
            }
        }
        return null;
    }

}
