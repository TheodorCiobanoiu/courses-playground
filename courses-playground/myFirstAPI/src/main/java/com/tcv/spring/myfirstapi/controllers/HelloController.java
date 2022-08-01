package com.tcv.spring.myfirstapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class HelloController {
    @GetMapping("/api/hello")
    public String sayHello(@RequestBody String string) {
        return "Hello";
    }
}
