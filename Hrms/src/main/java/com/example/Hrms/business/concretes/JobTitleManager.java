package com.example.Hrms.business.concretes;

import com.example.Hrms.business.abstracts.JobTitleService;
import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.core.utilities.results.SuccessDataResult;
import com.example.Hrms.dataAccess.abstracts.JobTitleDao;
import com.example.Hrms.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobTitleManager implements JobTitleService {
    private JobTitleDao jobTitleDao;
    @Autowired
    public JobTitleManager(JobTitleDao jobTitleDao) {
        this.jobTitleDao = jobTitleDao;
    }

    @Override
    public DataResult<JobTitle> getById(int id) {
        return new SuccessDataResult<>(jobTitleDao.getById(id));
    }
}
