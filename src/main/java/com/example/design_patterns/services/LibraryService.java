package com.example.design_patterns.services;

import com.example.design_patterns.model.User;
import com.example.design_patterns.model.Book;
import com.example.design_patterns.services.NotificationService;


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
