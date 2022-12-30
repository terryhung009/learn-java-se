package com.danny.demo1.controller;

import com.danny.demo1.model.LombokPOJO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(String name){

        return "hello world1---- " + name;
    }
}
