package com.example.Hrms.business.abstracts;

import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.entities.concretes.City;

public interface CityService {
    DataResult<City> findById(int id);
}
