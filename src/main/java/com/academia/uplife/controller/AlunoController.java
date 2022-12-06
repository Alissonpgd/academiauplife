package com.academia.uplife.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlunoController {

    @GetMapping("/")
    public String login(){
        return "login";
    } 

    @GetMapping("/index")
    public String index(){
        return "index";
    } 
}
