package com.example.design_patterns.model;

public class Book {
    private String title;
    private boolean available;

    public Book(String title) {
        this.title = title;
        this.available = true;  // By default, a new book is available
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

