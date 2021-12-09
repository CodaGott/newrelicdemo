package io.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello, World!";
    }

    @GetMapping("/another")
    public String another(){
        return "another end-point";
    }

}
