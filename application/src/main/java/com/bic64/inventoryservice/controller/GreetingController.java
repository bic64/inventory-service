package com.bic64.inventoryservice.controller;


import com.bic64.inventoryservice.domain.GreetingResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController()
@RequestMapping("/greeting")
public class GreetingController {
    private final static AtomicInteger COUNTER = new AtomicInteger(0);
    private static String appName;


    public GreetingController(@Value("${spring.application.name}") String appName) {
        this.appName = appName;
    }


    @GetMapping()
    public String greeting(@RequestParam(value = "name", defaultValue = "partner") String name) {
        return "Welcome to " + appName + ", " + name + ". You are number: " + COUNTER.addAndGet(1);
    }

    @GetMapping("/json")
    @ResponseBody
    public GreetingResponse greetingJson(@RequestParam(value = "name", defaultValue = "partner") String name) {
        GreetingResponse greetingResponse = new GreetingResponse();
        greetingResponse.setName(name);
        greetingResponse.setCount(COUNTER.addAndGet(1));

        return greetingResponse;
    }
}