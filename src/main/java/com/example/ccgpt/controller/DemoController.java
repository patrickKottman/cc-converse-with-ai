package com.example.ccgpt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ccgpt.service.DemoService;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/greeting")
    public String getGreeting() {
        return demoService.getGreeting();
    }
}
