package ru.ivanmurzin.testserver.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }

    @GetMapping("/hello/{name}/{id}")
    public String helloName(@PathVariable String name, @PathVariable int id) {
        return "Hello " + name + "with id=" + id + "!";
    }


}
