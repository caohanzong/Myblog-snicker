package com.chz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author snicker
 * @date 2022/1/5 17:56
 * @Describe
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    private Long id;
    private String nickname;
    private String email;
    private String content;
    private String avatar;
    private Date createTime;
    private Long parentMessageId;
    private boolean adminMessage;
    private String windowName;
    private String browserName;

    //回复留言
    private List<Message> replyMessages = new ArrayList<>();
    private Message parentMessage;
    private String parentNickname;

}
