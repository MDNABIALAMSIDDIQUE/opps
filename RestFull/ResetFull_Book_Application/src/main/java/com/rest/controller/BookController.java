package com.rest.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rest.modal.Book;
import com.rest.service.BookService;

@RestController
public class BookController {
    
    @Autowired
    private BookService bookService;


   @GetMapping("/book")
    public List<Book> getBook(){
        return this.bookService.getAllBook();
        
    }

    @GetMapping("/book/{id}")
    public Book getbookID(@PathVariable("id")int Id){
        return bookService.getBookById(Id);
    }
}
