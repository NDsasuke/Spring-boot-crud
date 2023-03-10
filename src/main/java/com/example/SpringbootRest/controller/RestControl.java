package com.example.SpringbootRest.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestControl {

    @PostMapping("/add")
    public void addRecord(){

    }

    @GetMapping("/all")
    public void findAllRecord(){

    }

    @GetMapping("/find/{id}")
    public void findById(){

    }

    @DeleteMapping("/delete/{id}")
    public void removeById(){

    }
}
