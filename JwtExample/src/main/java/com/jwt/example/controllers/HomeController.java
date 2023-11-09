package com.jwt.example.controllers;
import com.jwt.example.models.User;
import com.jwt.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.sql.SQLOutput;
import java.util.List;
@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private UserService userService;
    //localhost:8080/home/
    @GetMapping("/")
    private List<User> getuser()
    {
       return this.userService.getStore();
    }

    //Get User name whom login
    @GetMapping("/Get-username")
    private String getCureentUser(Principal principal)
    {
        return principal.getName();
    }
}
