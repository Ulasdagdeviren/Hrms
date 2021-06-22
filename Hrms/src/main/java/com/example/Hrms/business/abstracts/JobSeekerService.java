package com.example.Hrms.business.abstracts;

import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.entities.concretes.JobSeeker;

import java.util.List;

public interface JobSeekerService {
   DataResult<JobSeeker> Save(JobSeeker jobSeeker);
   DataResult<List<JobSeeker>> getAll();

}
