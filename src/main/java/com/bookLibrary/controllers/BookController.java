package com.bookLibrary.controllers;

import com.bookLibrary.models.Book;
import com.bookLibrary.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping
    public List<Book> getBooks() {
       // List<Book> bookList = new ArrayList<>();
        //---- --

        return bookService.getBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id) {

        return bookService.getBookById(id).get();
    }

    @PostMapping
    public Book addBook(@RequestBody Book newBook) {
        return null;
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody Book book) {
        return null;
    }

    @PatchMapping("/{id}")
    public void updatePriceBook(@PathVariable int id) {

    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable int id) {

    }




}
