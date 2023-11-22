package com.william.lot.service.impl;

import com.william.lot.mapper.UserMapper;
import com.william.lot.service.UserService;
import com.william.lot.utils.ResultVO;
import com.william.lot.vo.User;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

/**
 * @author li192
 */
@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Override
    public ResultVO login(String username, String password) {
        User user = userMapper.login(username);
        if (username==null) {
            return new ResultVO(1000,"用户名不存在",null);
        } else {
            if (user.getPassword().equals(password)) {
                return new ResultVO(1001,"登陆成功",user);
            } else {
                return new ResultVO(1002,"登陆失败",null);
            }
        }
    }
}
