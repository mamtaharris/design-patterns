package com.example.design_patterns.utils;

import com.example.design_patterns.model.*;


public class UserFactory {
    public static User createUser(String userType) {
        return switch (userType) {
            case "Admin" -> new Admin();
            case "Member" -> new Member();
            default -> throw new IllegalArgumentException("Unknown user type.");
        };
    }
}
