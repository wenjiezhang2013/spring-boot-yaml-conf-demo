package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.config.DemoConfig;

@RestController
public class DemoController {

    @Autowired
    private DemoConfig demoConfig;

    @RequestMapping("/")
    public String greeting() {
        return demoConfig.getName();
    }
}