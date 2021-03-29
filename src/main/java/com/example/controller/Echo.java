package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Ryan Xu
 * @Date 2021/3/29 14:21
 * @Description TODO
 **/
@RestController
public class Echo {
    @GetMapping("/echo")
    public String echo(){
        return "ok";
    }
}
