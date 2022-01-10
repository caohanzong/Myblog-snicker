package com.chz.service;

import com.chz.pojo.Blog;
import com.chz.queryvo.*;

import java.util.List;

/**
 * @author snicker
 * @date 2021/12/29 20:53
 * @Describe
 */
public interface BlogService {

    //查询文字管理列表
    List<BlogQuery> getAllBlog();
    //保存新增博客
    int saveBlog(Blog blog);
    //查询编辑修改的文章
    ShowBlog getBlogById(Long id);
    //编辑博客
    int updateBlog(ShowBlog showBlog);
    //删除博客
    void deleteBlog(Long id);



    //查询首页最新博客列表信息
    List<FirstPageBlog> getAllFirstPageBlog();
    //查询首页最新推荐信息
    List<RecommendBlog> getRecommendedBlog();
    //点击查询博客详情
    DetailedBlog getDetailedBlog(Long id);
    //根据typeId的分类，查询博客列表
    List<FirstPageBlog> getByTypeId(Long typeId);
    //搜索博客列表
    List<FirstPageBlog> getSearchBlog(String query);
    //统计博客总数
    Integer getBlogTotal();
    //统计访问总数
    Integer getBlogViewTotal();
    //统计评论总数
    Integer getBlogCommentTotal();
    //统计留言总数
    Integer getBlogMessageTotal();









}
