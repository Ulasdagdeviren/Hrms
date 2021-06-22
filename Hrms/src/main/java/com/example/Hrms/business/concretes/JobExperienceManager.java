package com.example.Hrms.business.concretes;

import com.example.Hrms.business.abstracts.JobExperienceService;
import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.core.utilities.results.SuccessDataResult;
import com.example.Hrms.dataAccess.abstracts.JobExperienceDao;
import com.example.Hrms.entities.concretes.JobExperience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobExperienceManager implements JobExperienceService {
    private JobExperienceDao jobExperienceDao;
    @Autowired
    public JobExperienceManager(JobExperienceDao jobExperienceDao) {
        this.jobExperienceDao = jobExperienceDao;
    }


    @Override
    public DataResult<JobExperience> getById(int id) {
        return new SuccessDataResult<>(jobExperienceDao.getById(id));
    }

    @Override
    public DataResult<List<JobExperience>> getByJobSeeker_Id(int jobSeekerId) {
        return new SuccessDataResult<>(jobExperienceDao.getByJobSeeker_Id(jobSeekerId),"Data Listed");
    }
}
