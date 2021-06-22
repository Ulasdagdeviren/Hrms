package com.example.Hrms.business.abstracts;

import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.entities.concretes.School;

import java.util.List;

public interface SchoolService {
    DataResult<School> getById(int id);
    DataResult<List<School>> getByJobSeeker_Id(int jobSeekerId);
}
