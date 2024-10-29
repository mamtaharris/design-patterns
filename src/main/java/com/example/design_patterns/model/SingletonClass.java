package com.example.design_patterns.model;

import org.springframework.stereotype.Component;

@Component
public class SingletonClass {
    private static SingletonClass instance;

    private SingletonClass() {
        // private constructor to prevent instantiation from outside
    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}
