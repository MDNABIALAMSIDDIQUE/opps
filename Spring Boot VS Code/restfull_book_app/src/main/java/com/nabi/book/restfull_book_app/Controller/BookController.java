package com.nabi.book.restfull_book_app.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nabi.book.restfull_book_app.Service.BookService;
import com.nabi.book.restfull_book_app.modal.Book;

@RestController
public class BookController {
    
    @Autowired
    private BookService bookService;

//get All Books
   @GetMapping("/book")
    public ResponseEntity<List<Book>> getBook(){

        List<Book>list=bookService.getAllBook();
        if(list.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(list);
    }



// get Book by ID
    @GetMapping("/book/{id}")
    public  ResponseEntity<Book> getbookID(@PathVariable("id")int Id){
        Book book= bookService.getBookById(Id);
        if(book==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(book));
    }




    // get Book Add 
    @PostMapping("/addBook")
    public ResponseEntity <Book> addBook(@RequestBody Book book){
        Book b= null;
        try {
            b =this.bookService.addBook(book);
           System.out.println(book);
            return ResponseEntity.of(Optional.of(b));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }




    // Deleted book list
    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<Void> deleteBook(@PathVariable("bookId")int bookId){
        try {
            this.bookService.deleteBook(bookId);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

        } catch (Exception e) {
           e.printStackTrace();
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    // Update Book List
    @PutMapping("book/{bookId}")
    public ResponseEntity <Book>  updatebook(@RequestBody Book book,@PathVariable
    ("bookId")int bookId)
    {
        try {
            this.bookService.updatebook(book, bookId);
            return ResponseEntity.ok().body(book);
            
        } catch (Exception e) {
           e.printStackTrace();
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
