package com.example.design_patterns.model;

public class Admin extends User {
    public Admin() {
        super("Admin");
    }

    @Override
    public void update(Book book) {
        System.out.println("Notification to Admin: " + book.getTitle() + " is now available.");
    }
}
