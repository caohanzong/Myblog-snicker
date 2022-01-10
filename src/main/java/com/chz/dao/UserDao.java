package com.chz.dao;

import com.chz.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author snicker
 * @date 2021/12/29 16:09
 * @Describe
 */
@Mapper
@Repository
public interface UserDao {

    /**
     * 管理员登录验证
     * @param username
     * @param password
     * @return
     */
    User findByusernameAndPassword(String username,String password);

}
