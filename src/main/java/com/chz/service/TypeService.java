package com.chz.service;

import com.chz.pojo.Type;

import java.util.List;

/**
 * @author snicker
 * @date 2021/12/30 16:30
 * @Describe
 */
public interface TypeService {

    //查询所有的文章类型
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
