package com.chz.service.impl;

import com.chz.dao.UserDao;
import com.chz.pojo.User;
import com.chz.service.UserService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author snicker
 * @date 2021/12/29 16:22
 * @Describe
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User checkUser(String username, String password) {
        User user = userDao.findByusernameAndPassword(username, password);
        return user;
    }
}
