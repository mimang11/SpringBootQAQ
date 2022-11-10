package com.example.sprringbootqaq.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author he
 * @Date 2022/10/9 15:05
 * @Version 1.0
 */
@RestController
public class DemoController {


    @GetMapping("/test")
    public  String testUser(){
        return "success";
    }


}
