package com.chz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author snicker
 * @date 2022/1/4 23:11
 * @Describe
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FriendLink {

    private Long id;
    private String blogName;
    private String blogAddress;
    private String pictureAddress;
    private Date createTime;

}
