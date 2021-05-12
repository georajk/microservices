package com.codergk.user.controller;

import com.codergk.user.entity.User;
import com.codergk.user.service.UserService;
import com.codergk.user.vo.UserResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {

        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public UserResponseVO findUserwithDepartment(@PathVariable("id") Long id) {
        return  userService.findUser(id);
    }
}
