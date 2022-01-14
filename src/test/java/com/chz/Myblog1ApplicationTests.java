package com.chz;

import com.chz.dao.MessageDao;
import com.chz.pojo.Message;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class Myblog1ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private MessageDao messageDao;

    @Test
    void go(){
        List<Message> messages = messageDao.findByParentIdNull(Long.parseLong("-1"));
        for(Message message : messages){
            Long id = message.getId();
            String parentNickname1 = message.getNickname();
            List<Message> childMessages = messageDao.findByParentIdNotNull(id);
            System.out.println(childMessages.size());
        }
    }

}
