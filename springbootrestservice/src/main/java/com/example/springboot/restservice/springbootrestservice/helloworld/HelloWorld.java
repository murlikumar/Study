package com.example.springboot.restservice.springbootrestservice.helloworld;

import com.example.springboot.restservice.springbootrestservice.bean.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping(path = "/helloWorld")
    public String helloWorld() {
        return "hello world";
    }
    @GetMapping(path = "/helloWorldBean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("helloBean world");
    }
}
