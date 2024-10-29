package com.example.design_patterns.services;

import com.example.design_patterns.model.*;
import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private final List<User> observers = new ArrayList<>();

    public void registerObserver(User user) {
        observers.add(user);
    }

    public void notifyObservers(Book book) {
        for (User user : observers) {
            user.update(book);
        }
        observers.clear();
    }
}
