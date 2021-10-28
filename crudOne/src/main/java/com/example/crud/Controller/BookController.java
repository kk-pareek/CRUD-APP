package com.example.crud.Controller;

import com.example.crud.Entity.Book;
import com.example.crud.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @PostMapping("/saveBook")
    public String saveBook(@RequestBody Book book) {
        bookRepository.save(book);
        return "Book saved successfully!!!";
    }

    @PostMapping("/saveBooks")
    public String saveBooks(@RequestBody List<Book> books) {
        bookRepository.saveAll(books);
        return "Books saved successfully!";
    }

    @GetMapping("/getBooks")
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/getBookById/{bookId}")
    public List<Book> getBookById(@PathVariable("bookId") Long id) {
        return bookRepository.findBybookId(id);
    }

    @GetMapping("/getBookByName/{bookName}")
    public List<Book> getBookByName(@PathVariable("bookName") String bookName) {
        return bookRepository.findBybookName(bookName);
    }
}
