package com.example.design_patterns.controller;

import com.example.design_patterns.model.SingletonClass;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class SingletonController {
    private SingletonClass singletonClass;

    public SingletonController(SingletonClass singletonClass) {
        this.singletonClass = singletonClass;
    }

    @GetMapping("/singleton")
    public String getSingleton() {
        return "This is a singleton instance: " + singletonClass.toString();
    }

}
