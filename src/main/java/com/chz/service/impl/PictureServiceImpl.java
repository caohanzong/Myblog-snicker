package com.chz.service.impl;

import com.chz.dao.PictureDao;
import com.chz.pojo.Picture;
import com.chz.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author snicker
 * @date 2022/1/4 23:37
 * @Describe
 */
@Service
public class PictureServiceImpl implements PictureService {

    @Autowired
    private PictureDao pictureDao;

    @Override
    public List<Picture> listPicture() {
        return pictureDao.listPicture();
    }

    @Override
    public int savePicture(Picture picture) {
        return pictureDao.savePicture(picture);
    }

    @Override
    public Picture getPicture(Long id) {
        return pictureDao.getPicture(id);
    }

    @Override
    public int updatePicture(Picture picture) {
        return pictureDao.updatePicture(picture);
    }

    @Override
    public void deletePicture(Long id) {
        pictureDao.deletePicture(id);
    }

}
