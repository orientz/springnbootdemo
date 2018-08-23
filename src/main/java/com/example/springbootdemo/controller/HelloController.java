package com.example.springbootdemo.controller;

import com.example.springbootdemo.db.mapper.ActorMapper;
import com.example.springbootdemo.db.model.Actor;
import com.example.springbootdemo.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private ActorService actorService;
    @RequestMapping("/hello")
    public String hello(){

        return "hello";
    }
}
