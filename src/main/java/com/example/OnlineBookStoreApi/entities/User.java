package com.example.OnlineBookStoreApi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import java.time.LocalTime;
import java.util.Date;
import java.util.Set;

@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name="userName",nullable = true,unique = true)
    private String userName;

    @Column(name = "email", nullable = true ,unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "upadatedAt")
    private Date UpdateAt;

    /*
    @ManyToMany
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Role> roles;*/


}
