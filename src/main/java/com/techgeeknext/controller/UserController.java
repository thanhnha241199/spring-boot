package com.techgeeknext.controller;
import com.techgeeknext.model.user.UserDao;
import com.techgeeknext.service.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin()
public class UserController {
    @Autowired
    private JwtUserDetailsService userDetailsService;

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String getEmployees() {
        return "Welcome!";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<UserDao> list() {
        return userDetailsService.listAllUser();
    }
}