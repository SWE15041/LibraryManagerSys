package com.librarymansys.demo.user.service;

import com.librarymansys.demo.user.domain.User;
import com.librarymansys.demo.user.dao.UserRepositpry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.relation.Role;

@Service
public class UserService {

    @Autowired
    UserRepositpry userRepositpry;

    public String  getRole(String username,String password){
        User user =userRepositpry.findFirstByUsername(username);
        String role="";
        if(user!=null && password.equals(user.getPassword())){
            role=user.getRole();
        }
        return role;
    }

}
