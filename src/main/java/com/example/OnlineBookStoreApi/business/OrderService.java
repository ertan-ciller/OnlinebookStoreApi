package com.example.OnlineBookStoreApi.business;

import com.example.OnlineBookStoreApi.dataAccess.OrderRepository;
import com.example.OnlineBookStoreApi.entities.Order;
import com.example.OnlineBookStoreApi.entities.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public List<Order> getAllOrders(){
        List<Order> orders = new ArrayList<Order>();
        orderRepository.findAll().forEach(order-> orders.add(order));
        return orders;
    }
}
