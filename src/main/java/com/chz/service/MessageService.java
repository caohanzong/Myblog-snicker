package com.chz.service;

import com.chz.pojo.Message;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author snicker
 * @date 2022/1/5 23:49
 * @Describe
 */
public interface MessageService {

    //保存留言
    int saveMessage(Message message);
    //查询留言列表
    List<Message> listMessage();
    //删除留言
    void deleteMessage(Long id);

}
