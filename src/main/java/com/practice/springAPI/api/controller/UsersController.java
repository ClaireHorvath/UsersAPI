package com.practice.springAPI.api.controller;

import com.practice.springAPI.api.model.Users;
import com.practice.springAPI.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    private UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping
    public Users getUsers(@RequestParam Integer id) {
        return usersService.getUsers(id);
    }
}
