package com.example.Hrms.api.controllers;

import com.example.Hrms.business.abstracts.JobExperienceService;
import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.entities.concretes.JobExperience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/JobExperience")
public class JobExperienceController {
    private JobExperienceService jobExperienceService;
    @Autowired
    public JobExperienceController(JobExperienceService jobExperienceService) {
        this.jobExperienceService = jobExperienceService;
    }
    @GetMapping("/getById")
    public DataResult<JobExperience> getById(@RequestParam int id)
    {
        return jobExperienceService.getById(id);
    }
    @GetMapping("/getByJobSeeker_Id")
    public DataResult<List<JobExperience>> getByJobSeeker_Id(@RequestParam int jobSeekerId)
    {
        return jobExperienceService.getByJobSeeker_Id(jobSeekerId);
    }
}
