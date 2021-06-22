package com.example.Hrms.business.abstracts;

import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.entities.concretes.JobExperience;

import java.util.List;

public interface JobExperienceService {
    DataResult<JobExperience>getById(int id);
    DataResult<List<JobExperience>> getByJobSeeker_Id(int jobSeekerId);
}
