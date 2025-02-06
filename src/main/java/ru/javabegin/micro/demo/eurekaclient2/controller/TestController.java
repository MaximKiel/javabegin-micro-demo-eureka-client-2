package ru.javabegin.micro.demo.eurekaclient2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main-2")
public class TestController {

    @GetMapping("/name")
    public String test() {
        return "client-2";
    }
}