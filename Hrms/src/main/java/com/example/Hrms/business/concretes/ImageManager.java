package com.example.Hrms.business.concretes;

import com.example.Hrms.business.abstracts.ImageService;
import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.core.utilities.results.SuccessDataResult;
import com.example.Hrms.dataAccess.abstracts.ImageDao;
import com.example.Hrms.entities.concretes.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageManager implements ImageService {
    private ImageDao imageDao;
    @Autowired
    public ImageManager(ImageDao imageDao) {
        this.imageDao = imageDao;
    }

    @Override
    public DataResult<Image> getByUser_Id(int userId) {
        return new SuccessDataResult<>(imageDao.getByUser_Id(userId));
    }
}
