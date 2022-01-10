package com.chz.dao;

import com.chz.pojo.FriendLink;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author snicker
 * @date 2022/1/4 23:13
 * @Describe
 */
@Mapper
@Repository
public interface FriendLinkDao {

    //查询友链管理列表
    List<FriendLink> listFriendLink();

    //新增友链
    int saveFriendLink(FriendLink friendLink);

    //根据网址查询友链
    FriendLink getFriendLinkByBlogaddress(String blogAddress);

    //根据id查询友链
    FriendLink getFriendLink(Long id);

    //编辑修改友链
    int updateFriendLink(FriendLink friendLink);

    //删除友链
    void deleteFriendLink(Long id);

}
