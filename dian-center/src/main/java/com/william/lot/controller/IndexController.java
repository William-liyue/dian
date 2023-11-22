package com.william.lot.controller;

import com.william.lot.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    private UserService userService;
//    @GetMapping("")
//    public String index() {
//        return "/index";
//    }
}
