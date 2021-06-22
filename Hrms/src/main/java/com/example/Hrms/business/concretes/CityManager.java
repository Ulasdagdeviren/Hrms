package com.example.Hrms.business.concretes;

import com.example.Hrms.business.abstracts.CityService;
import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.core.utilities.results.SuccessDataResult;
import com.example.Hrms.dataAccess.abstracts.CityDao;
import com.example.Hrms.entities.concretes.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityManager implements CityService {
    private CityDao cityDao;
    @Autowired
    public CityManager(CityDao cityDao) {
        this.cityDao = cityDao;
    }


    @Override
    public DataResult<City> findById(int id) {
        return new SuccessDataResult<>(cityDao.findById(id));
    }
}
