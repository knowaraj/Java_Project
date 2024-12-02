package com.lproject.LibraryMS.service.impl;

import com.lproject.LibraryMS.model.User;
import com.lproject.LibraryMS.service.AuthService;
import com.lproject.LibraryMS.service.UserService;
import com.lproject.LibraryMS.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {


    @Autowired
    private UserService userService;


    @Override
    public String login(String username, String password) {
        User user = userService.findByUsername(username);
        if (user == null || !user.getPassword().equals(password)) {
            throw new RuntimeException("login failed");
        } else {
            return JwtUtil.generateToken(user);
        }
    }
        @Override
        public boolean changePassword (String oldpassword, String newpassword){
            return false;
        }
    }

