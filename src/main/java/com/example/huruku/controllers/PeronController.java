package com.example.huruku.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PeronController {

    @GetMapping("/api/")
    public String getInfo(){
        return "hello from spring api";
    }
}
