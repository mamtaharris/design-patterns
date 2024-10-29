package com.example.design_patterns.services;

public interface PricingStrategy {
    double getPrice();
}

class RegularPricingStrategy implements PricingStrategy {
    public double getPrice() {
        return 2.5;
    }
}

class PremiumPricingStrategy implements PricingStrategy {
    public double getPrice() {
        return 1.5;
    }
}