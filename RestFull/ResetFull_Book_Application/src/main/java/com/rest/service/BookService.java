package com.rest.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rest.modal.Book;

@Component
public class BookService {
    private static List<Book> list= new ArrayList<>();

    static{
        list.add(new Book(122,"Core Java","Hari Sir",452.25f));
        list.add(new Book(132,"Adv Java","Ashok Sir",856.25f));
        list.add(new Book(142,"Spring","Natraj Sir",1263.25f));

    }


    // All Book return
    public List<Book> getAllBook(){
        return list;
    }

    public Book getBookById(int Id){
        Book book=null;
        book=list.stream().filter(e->e.getId()==Id).findFirst().get();
        return book;
    }
}
