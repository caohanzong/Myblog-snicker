package com.chz.dao;

import com.chz.pojo.Message;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author snicker
 * @date 2022/1/5 23:46
 * @Describe
 */
@Mapper
@Repository
public interface MessageDao {

    //添加一个留言
    int saveMessage(Message message);
    //查询父级留言
    List<Message> findByParentIdNull(@Param("ParentId") Long ParentId);
    //查询一级回复
    List<Message> findByParentIdNotNull(@Param("id") Long id);
    //查询二级以及所有子集回复
    List<Message> findByReplayId(@Param("childId") Long childId);
    //删除评论
    void deleteMessage(Long id);

}
