package com.example.OnlineBookStoreApi.dataAccess;

import com.example.OnlineBookStoreApi.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

/*    @Query("SELECT * FROM books ORDER BY DATE DESC")
    public List<Book> getAllBooksByCreationDate();*/

}
