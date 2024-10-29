package com.example.design_patterns.utils;

import com.example.design_patterns.services.NotificationService;
import com.example.design_patterns.model.*;

public class LibraryService {
    private final NotificationService notificationService = new NotificationService();

    public void checkoutBook(User user, Book book) {
        if (!book.isAvailable()) {
            System.out.println("Book is currently unavailable.");
            notificationService.registerObserver(user);
        } else {
            System.out.println(user.getName() + " checked out " + book.getTitle());
            book.setAvailable(false);
        }
    }

    public void returnBook(Book book) {
        book.setAvailable(true);
        notificationService.notifyObservers(book);
    }
}