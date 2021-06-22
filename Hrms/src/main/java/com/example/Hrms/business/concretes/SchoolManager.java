package com.example.Hrms.business.concretes;

import com.example.Hrms.business.abstracts.SchoolService;
import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.core.utilities.results.SuccessDataResult;
import com.example.Hrms.dataAccess.abstracts.SchoolDao;
import com.example.Hrms.entities.concretes.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SchoolManager implements SchoolService {
    private SchoolDao schoolDao;
    @Autowired
    public SchoolManager(SchoolDao schoolDao) {
        this.schoolDao = schoolDao;
    }

    @Override
    public DataResult<School> getById(int id) {
        return new SuccessDataResult<>(schoolDao.getById(id));
    }

    @Override
    public DataResult<List<School>> getByJobSeeker_Id(int jobSeekerId) {
        return new SuccessDataResult<>(schoolDao.getByJobSeeker_Id(jobSeekerId));
    }
}
