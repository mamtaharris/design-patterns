package com.example.design_patterns.controller;

import com.example.design_patterns.model.User;
import com.example.design_patterns.utils.*;
import com.example.design_patterns.services.*;
import com.example.design_patterns.model.*;

import com.example.design_patterns.utils.LibraryService;
import com.example.design_patterns.utils.UserFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/library")
public class DesignPatternsController {
    private final LibraryService libraryService = new LibraryService();

    @PostMapping("/checkout")
    public String checkoutBook(@RequestParam String userType, @RequestParam String bookTitle) {
        if (userType == null || bookTitle == null) {
            return ResponseEntity.badRequest().body("User type and book title are required.").toString();
        }
        User user = UserFactory.createUser(userType);
        Book book = new Book(bookTitle);
        libraryService.checkoutBook(user, book);
        return user.getName() + " checked out " + book.getTitle();
    }

    @PostMapping("/return")
    public String returnBook(@RequestParam String bookTitle) {
        Book book = new Book(bookTitle);
        libraryService.returnBook(book);
        return bookTitle + " has been returned.";
    }

    @GetMapping("/best-seller")
    public String getBestSeller(@RequestParam String bookTitle) {
        Book book = new Book(bookTitle);
        BestSellerDecorator bestSellerBook = new BestSellerDecorator(book);
        return bestSellerBook.getDetails();
    }
}