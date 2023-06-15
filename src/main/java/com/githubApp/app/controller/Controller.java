package com.githubApp.app.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    public String helloWorld(){
        return "Hello World !";
    }
}