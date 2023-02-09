package com.mastercraft.rest.api.controllers;

import com.mastercraft.rest.api.models.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @PostMapping("/user")
    public Users creatUser(@RequestBody Users users) {
        return new Users(users.getId(), users.getFullName(), users.getAge());
    }
}
