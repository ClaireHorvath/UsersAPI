package com.practice.springAPI.service;

import com.practice.springAPI.api.model.Users;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UsersService {

    private List<Users> usersList;

    public UsersService() {
        usersList = new ArrayList<>();

        Users users1 = new Users(1, "Becky", "becky@mail.com", 23);
        Users users2 = new Users(2, "Sarah", "sarah@mail.com", 62);
        Users users3 = new Users(3, "Carl", "carl@mail.com", 54);
        Users users4 = new Users(4, "Thomas", "thomas@mail.com", 23);

        usersList.addAll(Arrays.asList(users1, users2, users3, users4));
    }

    public Users getUsers(Integer id) {
        for (Users users: usersList) {
            if (id == users.getId()) {
                return  users;
            }
        }
    }
}
