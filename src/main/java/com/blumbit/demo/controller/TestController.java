package com.blumbit.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    String helloWorld(){
        return "Hola mundo";
    }
}
