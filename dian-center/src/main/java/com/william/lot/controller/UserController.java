package com.william.lot.controller;

import com.william.lot.service.UserService;
import com.william.lot.utils.ResultVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("")
    public ResultVO login(String username,String password) {
        return userService.login(username, password);
    }
}
