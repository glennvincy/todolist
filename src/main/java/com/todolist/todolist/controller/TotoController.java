package com.todolist.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("todolist-toto")
public class TotoController {

    @GetMapping("get/toto")
    public String getToto() {
        return "toto";
    }
}
