package com.example.Hrms.api.controllers;

import com.example.Hrms.business.abstracts.JobSeekerService;
import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/jobSeekers")
public class JobSeekersController {
   private JobSeekerService jobSeekerService;
    @Autowired
    public JobSeekersController(JobSeekerService jobSeekerService) {
        this.jobSeekerService = jobSeekerService;
    }

    @PostMapping("/add")
    public DataResult<JobSeeker> add(@Valid @RequestBody JobSeeker jobSeeker)  {
        return this.jobSeekerService.Save(jobSeeker);
    }
}
