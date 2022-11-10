package com.example.sprringbootqaq.controller;

import com.example.sprringbootqaq.entity.Result;
import com.example.sprringbootqaq.entity.User;
import com.example.sprringbootqaq.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author he
 * @Date 2022/11/10 7:38
 * @Version 1.0
 */
@CrossOrigin
@RestController
@RequestMapping("api")
public class ApiController {
    @Autowired
    private UserMapper userMapper;


    @GetMapping("getProdList")
    public Result getProdList() throws InterruptedException {
        List<User> users = userMapper.selectAllUser();

        //休眠5ms
      //  Thread.sleep(5000);
        return  new Result(200,users);
    }
}
