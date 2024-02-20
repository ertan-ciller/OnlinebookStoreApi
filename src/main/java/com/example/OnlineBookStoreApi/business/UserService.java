package com.example.OnlineBookStoreApi.business;

import com.example.OnlineBookStoreApi.core.exceptionHandling.NotFoundException;
import com.example.OnlineBookStoreApi.dataAccess.UserRepository;
import com.example.OnlineBookStoreApi.entities.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<User> getAllUsers(){

        List<User> users = new ArrayList<User>();
        userRepository.findAll().forEach(user -> users.add(user));
        return users;
    }
    public User findById(String id){
        //List<User> user = new ArrayList<User>();
        return userRepository.findById(id).orElseThrow(()-> new NotFoundException("User not found with the given ID"));
    }
    public User createUser(User user){
        User newUser = new User();
        newUser.setUserName(user.getUserName());
        newUser.setPassword(passwordEncoder.encode(user.getPassword()));
        newUser.setEmail(user.getEmail());
        newUser.setCreatedAt(user.getCreatedAt());

        return userRepository.save(newUser);

    }

}
