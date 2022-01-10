package com.chz.service;

import com.chz.pojo.Comment;

import java.util.List;

/**
 * @author snicker
 * @date 2022/1/6 16:26
 * @Describe
 */
public interface CommentService {

    //添加一个评论
    int saveComment(Comment comment);
    //查询评论列表
    List<Comment> listCommentByBlogId(Long blogId);
    //删除评论
    void deleteComment(Comment comment,Long id);

}
