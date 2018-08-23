package com.librarymansys.demo.user.service;

import com.librarymansys.demo.user.domain.User;
import com.librarymansys.demo.user.dao.UserRepositpry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepositpry userRepositpry;

    public String  getRole(String username,String password){
        User user =userRepositpry.findFirstByUsernameAndPassword(username,password);
        String role = user.getRole();
        return role;
    }

}
