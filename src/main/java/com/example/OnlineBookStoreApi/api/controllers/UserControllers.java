package com.example.OnlineBookStoreApi.api.controllers;

import com.example.OnlineBookStoreApi.business.UserService;
import com.example.OnlineBookStoreApi.entities.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserControllers {
    @Autowired
    UserService userService;


 /*   @RequestMapping(value = "",
        method = RequestMethod.GET
            ,produces = {"application/json","application/xml"})
    @ResponseStatus(HttpStatus.OK)*/
    @GetMapping("/getUsers")
    private List<User> getAllOrders(){
        return userService.getAllUsers();

    }
    @PostMapping("/signup")
    private void createUser(@RequestBody User user,
                            HttpServletRequest request, HttpServletResponse response){
        User createdUser = this.userService.createUser(user);
        response.setHeader("Location",request.getRequestURL().append("/").append(createdUser.getId()).toString());

    }
    @PostMapping("/test-request")
    public ResponseEntity<String> testPostRequest() {
        return ResponseEntity.ok("POST request successful");
    }
}
