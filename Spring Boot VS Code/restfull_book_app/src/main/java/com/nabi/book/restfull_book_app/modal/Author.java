package com.nabi.book.restfull_book_app.modal;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table
public class Author {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String firstName;
    private String lastName;
    private String lang;
    @OneToOne(mappedBy = "author")
    @JsonBackReference
    private Book book;


}
