package com.example.OnlineBookStoreApi.api.controllers;

import com.example.OnlineBookStoreApi.DTO.LoginDTO;
import com.example.OnlineBookStoreApi.DTO.SignUpDTO;
import com.example.OnlineBookStoreApi.dataAccess.RoleRepository;
import com.example.OnlineBookStoreApi.dataAccess.UserRepository;
import com.example.OnlineBookStoreApi.entities.Role;
import com.example.OnlineBookStoreApi.entities.User;
import io.swagger.v3.oas.models.examples.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/api")
public class HomeController {

    /*
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;*/
/*
    @PostMapping("/login")
    public ResponseEntity<String> authenticateUser(@RequestBody LoginDTO loginDTO){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginDTO.getUserName(),loginDTO.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        return new ResponseEntity<>("User login succesfully!!...", HttpStatus.OK);

    }*/
    /*
    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody SignUpDTO signUpDTO){
        //checking for username exists in a database

        if (userRepository.existsById(Integer.toString(signUpDTO.getId()))){
            return new ResponseEntity<>("Username is already exist!", HttpStatus.BAD_REQUEST);

        }
        // checking for email exists in a database
        if(userRepository.existsById(Integer.toString(signUpDTO.getId()))){
            return new ResponseEntity<>("Email is already exist!", HttpStatus.BAD_REQUEST);
        }

        // creating user object
        /*
        User user = new User();
        user.setName(signUpDTO.getName());
        user.setUserName(signUpDTO.getUserName());
        user.setEmail(signUpDTO.getEmail());
        user.setPassword(passwordEncoder.encode(signUpDTO.getPassword()));

        Role roles = roleRepository.findByName("ROLE_ADMIN").get();
        user.setRoles(Collections.singleton(roles));
        userRepository.save(user);
        return new ResponseEntity<>("User is registered successfully!",HttpStatus.OK);

    }*/

}
