package com.bookLibrary.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DefaultController {

    @RequestMapping("/")
    public String index() {
        return new Date().toString();
    }

    @GetMapping("/random")
    public int getRandomNumber() {
        return (int) (Math.random() * 100);
    }


}
