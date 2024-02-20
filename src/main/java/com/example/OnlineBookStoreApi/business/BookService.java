package com.example.OnlineBookStoreApi.business;

import com.example.OnlineBookStoreApi.core.exceptionHandling.NotFoundException;
import com.example.OnlineBookStoreApi.dataAccess.BookRepository;
import com.example.OnlineBookStoreApi.entities.Book;
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
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> getAllBooks(){

        List<Book> books = new ArrayList<Book>();
        bookRepository.findAll().forEach(book -> books.add(book));
        //bookRepository.getAllBooksByCreationDate().forEach(book -> books.add(book));
        return books;
    }
    public Book findById(int id){
        //List<User> user = new ArrayList<User>();
        return bookRepository.findById(id).orElseThrow(()-> new NotFoundException("User not found with the given ID "  ));
    }
}
