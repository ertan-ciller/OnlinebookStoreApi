package com.example.OnlineBookStoreApi.api.controllers;


import com.example.OnlineBookStoreApi.business.OrderService;
import com.example.OnlineBookStoreApi.entities.Order;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class OrderController {

    @Autowired
    OrderService orderService;


    @GetMapping("/orders")
    private List<Order> getAllOrders(){
        return orderService.getAllOrders();

    }

}
