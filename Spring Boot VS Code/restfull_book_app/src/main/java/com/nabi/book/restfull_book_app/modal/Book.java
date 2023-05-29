package com.nabi.book.restfull_book_app.modal;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Book {
    public Book() {
    }

    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String abook;
    private float amount;
    @OneToOne(cascade =  CascadeType.ALL)
    @JsonManagedReference
    private Author author;


    

        


}
