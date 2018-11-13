/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author abedf
 */
@RestController
public class LibraryController {
    private Library library = new Library();
    
    @RequestMapping(value = "/library", method = RequestMethod.GET)
    public List<Book> getBooks() {
        return library.getAllBooks();
    }
    
    @RequestMapping(value = "/library/{id}", method = RequestMethod.GET)
    public Book getBook(@PathVariable("id") int id) {
        return library.getBook(id);
    }
    
    @RequestMapping(value = "/library", method = RequestMethod.POST)
    public Book addBook(@RequestBody Book book) {
        return library.addBook(book);
    }
    
    @RequestMapping(value = "/library/{id}", method = RequestMethod.PUT)
    public Book updateBook(@PathVariable("id") int id, @RequestBody Book book) {
        return library.updateBook(id, book);
    }
    
    @RequestMapping(value = "/library/{id}", method = RequestMethod.DELETE)
    public List<Book> removeBook(@PathVariable("id") int id) {
        library.removeBook(id);
        return library.getAllBooks();
    }
   
}

