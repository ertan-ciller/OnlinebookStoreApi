package com.example.OnlineBookStoreApi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Table(name = "orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderId")
    private int orderId;
    @Column(name = "userId")
    private int userId;
    @Column(name = "totalPrice")
    private Double totalPrice;
    @Column(name = "listOfBooks")
    private String listOfBooks;
    @Column(name = "orderDate")
    private Date orderDate;
    @Column(name = "createdAt")
    private Date createdAt;

}
