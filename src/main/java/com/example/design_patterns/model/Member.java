package com.example.design_patterns.model;

public class Member extends User {
    public Member() {
        super("Member");
    }

    @Override
    public void update(Book book) {
        System.out.println("Notification to Member: " + book.getTitle() + " is now available.");
    }
}