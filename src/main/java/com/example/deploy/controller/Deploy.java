package com.example.deploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aws")
public class Deploy {

    @GetMapping("deploy")
    public String get(){
        return "yes";
    }
}
