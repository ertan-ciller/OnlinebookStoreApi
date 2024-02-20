package com.example.OnlineBookStoreApi.dataAccess;

import com.example.OnlineBookStoreApi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

    User findByUserName(String userName);
    //String existsByEmail(String email);
    //String existsByUserName(String userName);

}
