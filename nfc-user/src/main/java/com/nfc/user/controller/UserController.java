package com.nfc.user.controller;

import com.nfc.user.model.User;
import com.nfc.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id) {
        //User user = userService.getUser(id);
        User user = new User();
        user.setId(id);
        user.setEmail("email@email.com");
        return user;
    }

}
