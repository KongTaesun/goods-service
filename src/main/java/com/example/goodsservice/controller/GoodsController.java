package com.example.goodsservice.controller;

import com.example.goodsservice.vo.Greeting;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GoodsController {

    @Autowired
    private Greeting greeting;

    @GetMapping("/welcome")
    public String welcome(HttpServletRequest request, HttpServletResponse response) {
        return greeting.getMessage();
    }
}
