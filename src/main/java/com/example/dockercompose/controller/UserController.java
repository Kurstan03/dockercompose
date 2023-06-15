package com.example.dockercompose.controller;

import com.example.dockercompose.entity.User;
import com.example.dockercompose.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author kurstan
 * @created at 09.06.2023 17:17
 */
@RestController
@RequestMapping(name = "/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/getAll")
    List<User> getAll(){
        return userService.findAll();
    }

    @PostMapping("/save")
    public User save(@RequestBody User user){
        return userService.save(user);
    }
}

