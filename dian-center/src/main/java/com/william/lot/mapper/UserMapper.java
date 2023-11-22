package com.william.lot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.william.lot.vo.User;
import org.springframework.web.bind.annotation.RequestParam;

@Mapper
public interface UserMapper extends BaseMapper<UserMapper> {

    public User login(String username);
}