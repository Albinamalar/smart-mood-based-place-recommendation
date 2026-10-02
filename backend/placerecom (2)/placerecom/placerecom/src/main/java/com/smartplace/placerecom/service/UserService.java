package com.smartplace.placerecom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartplace.placerecom.dto.LoginDTO;
import com.smartplace.placerecom.dto.RegisterDTO;
import com.smartplace.placerecom.entity.UserEntity;
import com.smartplace.placerecom.repository.UserRepo;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public String register(RegisterDTO registerDTO) {

        if (!registerDTO.getPassword().equals(registerDTO.getConfirmPassword())) {
            return "Passwords do not match";
        }

        UserEntity existingUser = userRepo.findByEmail(registerDTO.getEmail());

        if (existingUser != null) {
            return "Email already exists";
        }

        UserEntity user = new UserEntity();

        user.setName(registerDTO.getName());
        user.setEmail(registerDTO.getEmail());
        user.setPassword(registerDTO.getPassword());

        userRepo.save(user);

        return "Registration Successful";
    }

    public String login(LoginDTO loginDTO) {

        UserEntity dbUser = userRepo.findByEmail(loginDTO.getEmail());

        if (dbUser != null &&
            dbUser.getPassword().equals(loginDTO.getPassword())) {

            return "Login Successful";
        }

        return "Invalid Credentials";

    }

}