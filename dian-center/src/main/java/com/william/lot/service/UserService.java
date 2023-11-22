package com.william.lot.service;

import com.william.lot.utils.ResultVO;
import com.william.lot.vo.User;

/**
 * @author li192
 */
public interface UserService {

    public ResultVO login(String username, String password);

}
