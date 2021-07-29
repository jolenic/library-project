package com.libraryproject.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Book {
    private final UUID book_id;
    private String title;
    private String author;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public UUID getBookId() {
        return book_id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Book(@JsonProperty("book_id") UUID book_id,
                @JsonProperty("title") String title,
                @JsonProperty("author") String author){
        this.book_id = book_id;
        this.title = title;
        this.author = author;
    }

    public String toString() {
       return "Title: "+ title + ", Author: " + author;
    }
}
