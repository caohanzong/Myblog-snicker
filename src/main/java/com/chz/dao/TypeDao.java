package com.chz.dao;

import com.chz.pojo.Type;
import com.chz.queryvo.FirstPageBlog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author snicker
 * @date 2021/12/30 16:27
 * @Describe
 */
@Mapper
@Repository
public interface TypeDao {

    //查询所有的分类
    List<Type> getAllType();
    //根据id查询分类
    Type getType(Long id);
    //新增保存分类
    int saveType(Type type);
    //根据分类名称查询分类
    Type getTypeByName(String name);
    //编辑修改分类
    int updateType(Type type);
    //删除分类
    int deleteType(Long id);

    //查询文章的所有分类
    List<Type> getAllTypeAndBlog();


















}
