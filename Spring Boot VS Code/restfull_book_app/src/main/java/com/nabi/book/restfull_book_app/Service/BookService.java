package com.nabi.book.restfull_book_app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nabi.book.restfull_book_app.Dao.BookRepo;
import com.nabi.book.restfull_book_app.modal.Book;

@Component
public class BookService {

    @Autowired
    private BookRepo bookRepo;
    /*
    private static List<Book> list= new ArrayList<>();

    static{
        list.add(new Book(122,"Core Java","Hari Sir",452.25f));
        list.add(new Book(132,"Adv Java","Ashok Sir",856.25f));
        list.add(new Book(142,"Spring","Natraj Sir",1263.25f));

    }
    */

    // All Book return
    public List<Book> getAllBook(){
        List<Book> list=(List<Book>)this.bookRepo.findAll();
        return list;
    }

    

    //  find by Book id
    public Book getBookById(int Id){
        Book book=null;
       try {
       // book=list.stream().filter(e->e.getId()==Id).findFirst().get();
      book= this.bookRepo.findById(Id);

       } catch (Exception e) {
        e.printStackTrace();
       }
        return book;
    }


    // adding Book
    public Book addBook(Book b){
        Book result=bookRepo.save(b);
        return result;
    }

    // Delete  Book
    public void deleteBook(int bid){
      // list= list.stream().filter(book->book.getId()!=bid) .collect(Collectors.toList());
        bookRepo.deleteById(bid);
    }
    // update Book
    public void updatebook(Book book,int bookId){
    //    list= list.stream().map(b->{
    //         if(b.getId()==bookId){
    //             b.setName(book.getName());
    //             b.setAbook(book.getAbook());
    //             b.setAmount(book.getAmount());
    //         }
    //         return b;
    //     }).collect(Collectors.toList());

        book.setId(bookId);
        bookRepo.save(book);


    }

}
