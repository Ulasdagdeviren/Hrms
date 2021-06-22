package com.example.Hrms.business.abstracts;

import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.entities.concretes.Image;

public interface ImageService {
    DataResult<Image> getByUser_Id(int userId);
}
