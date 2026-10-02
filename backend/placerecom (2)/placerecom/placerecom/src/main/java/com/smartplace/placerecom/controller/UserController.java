package com.smartplace.placerecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.smartplace.placerecom.dto.LoginDTO;
import com.smartplace.placerecom.dto.RegisterDTO;
import com.smartplace.placerecom.service.UserService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody RegisterDTO registerDTO) {

        return userService.register(registerDTO);

    }

    @PostMapping("/login")
    public String login(@RequestBody LoginDTO loginDTO) {

        return userService.login(loginDTO);

    }

}