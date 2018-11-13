/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Library;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abedf
 */
public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList();
        books.add(new Book(0, "hej", "hej", "hej", 2018, 1));
        books.add(new Book(1, "hejdå", "hej", "hej", 2012, 1));
        books.add(new Book(2, "tja", "hej", "hej", 1995, 1));
        books.add(new Book(3, "yoo", "hej", "hej", 1377, 1));
    }
    
    public List<Book> getAllBooks() {
        return books;
    }
    
    public Book getBook(int id) {
        return books.get(id);
    }
    
    public Book addBook(Book book) {
        book.setId(books.size());
        books.add(book);
        return book;
    }
    
    public Book updateBook(int id, Book book) {
        books.remove(id);
        book.setId(id);
        books.add(book);
        return book;
    }
    
    public void removeBook(int id) {
        books.remove(id);
    }
}
