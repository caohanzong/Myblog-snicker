package com.chz.service;

import com.chz.pojo.User;

/**
 * @author snicker
 * @date 2021/12/29 16:22
 * @Describe
 */
public interface UserService {
    /**
     * 判断用户登录
     * @param username
     * @param password
     * @return
     */
    User checkUser(String username, String password);
}
