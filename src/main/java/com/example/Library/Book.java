/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Library;

/**
 *
 * @author abedf
 */
public class Book {
    private int id;
    private String title;
    private String author;
    private String description;
    private int year;
    private int edition;
    
    public Book() {
        
    }

    public Book(int id, String title, String author, String description, int year, int edition) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.description = description;
        this.year = year;
        this.edition = edition;
    }
    
    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
    
    
}
