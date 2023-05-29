package com.nabi.book.restfull_book_app.Dao;

import org.springframework.data.repository.CrudRepository;

import com.nabi.book.restfull_book_app.modal.Book;

public interface BookRepo extends CrudRepository<Book,Integer>{
    public Book findById(int Id);
    
}
