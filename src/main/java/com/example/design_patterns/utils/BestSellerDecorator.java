package com.example.design_patterns.utils;

import com.example.design_patterns.model.*;

interface BookDecorator {
    String getDetails();
}

public class BestSellerDecorator implements BookDecorator {
    private final Book book;

    public BestSellerDecorator(Book book) {
        this.book = book;
    }

    @Override
    public String getDetails() {
        return book.getTitle() + " - Best Seller";
    }
}
