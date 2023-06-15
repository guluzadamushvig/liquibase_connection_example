package com.example.liguibase.liguibase.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/test")
public class TestController {
    @GetMapping(value = "/dummy")
    public String testGet(){
        return "This method is for test get operation";
    }
}
