package com.chz.service;

import com.chz.pojo.Picture;

import java.util.List;

/**
 * @author snicker
 * @date 2022/1/4 23:37
 * @Describe
 */
public interface PictureService {

    //查询照片
    List<Picture> listPicture();

    //添加图片
    int savePicture(Picture picture);

    //根据id查询照片
    Picture getPicture(Long id);

    //编辑修改相册
    int updatePicture(Picture picture);

    //删除照片
    void deletePicture(Long id);

}
