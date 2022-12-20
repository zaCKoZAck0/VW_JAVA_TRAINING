package com.project.server.jpa.controller;
import com.project.server.jpa.entity.Book;
import com.project.server.jpa.repository.BookJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path = "/books")
//@CrossOrigin(origins = "*")
public class BookController {
    @Autowired
    private BookJpaRepository bookrepo;


    @PostMapping(value = "/add")
    public ResponseEntity<Book> createStudent(@RequestBody Book book) {
        Book savedBook = bookrepo.save(book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);

    }

    @GetMapping(path = "/all", produces = "application/json")
    public ResponseEntity<List<Book>> getAllBooks() {
        return new ResponseEntity<>(bookrepo.findAll(),HttpStatus.OK);
    }

    @GetMapping(path = "/search/{query}", produces = "application/json")
    public ResponseEntity<List<Book>> searchBook(@PathVariable String query) {
        return new ResponseEntity<>(bookrepo.findByNameIgnoreCaseContaining(query), HttpStatus.OK);
    }
    @GetMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Book newBook = bookrepo.findById(id).get();
        return new ResponseEntity<>(newBook,HttpStatus.OK);
    }

    @PutMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<Book> replaceBook(@RequestBody Book newBook, @PathVariable Long id) {
        return new ResponseEntity<>(bookrepo.findById(id)
                .map(book -> {
                    book.setName(newBook.getName());
                    book.setAuthor(newBook.getAuthor());
                    book.setUrl(newBook.getUrl());
                    return bookrepo.save(book);
                })
                .orElseGet(() -> bookrepo.save(newBook)), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<String> deleteBook(@PathVariable Long id) {
        bookrepo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
