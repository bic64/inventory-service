package com.bic64.inventoryservice.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/greeting")
public class GreetingController {

    private static final String template = "Welcome to %s";

    private static String appName;


    public GreetingController(@Value("${spring.application.name}") String appName) {
        this.appName = appName;
    }


    @GetMapping()
    public String greeting(
            @RequestParam(value = "name", defaultValue = "partner") String name) {
        return String.format(template, appName) + ", " + name;
    }
}