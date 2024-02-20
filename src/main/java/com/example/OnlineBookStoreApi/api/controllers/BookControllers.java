package com.example.OnlineBookStoreApi.api.controllers;

import com.example.OnlineBookStoreApi.business.BookService;
import com.example.OnlineBookStoreApi.entities.Book;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class BookControllers {

    /*OpenAPI definition ile springdoc-openapi-starter-webmvc-ui dependency' ini ekleyerek
        kolay bir şekilde swagger'i entegre edebiliriz. Ama bu swagger 3 versionu için
        Swagger 2 için ise,
            springdoc-openapi-ui kullanılmalıdır.

    * */
    @Autowired
    BookService bookService;


    @GetMapping("/books")
    private List<Book> getAllBooks() {
        return bookService.getAllBooks();

    }
    @GetMapping("/retrieveBookById/{id}")
    private Book getBookFindById(@PathVariable int id){
        return bookService.findById(id);
    }


}
