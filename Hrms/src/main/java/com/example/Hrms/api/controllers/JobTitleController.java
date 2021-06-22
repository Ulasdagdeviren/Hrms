package com.example.Hrms.api.controllers;

import com.example.Hrms.business.abstracts.JobTitleService;
import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jobTitles")
public class JobTitleController {
    private JobTitleService jobTitleService;
    @Autowired
    public JobTitleController(JobTitleService jobTitleService) {
        this.jobTitleService = jobTitleService;
    }
    @GetMapping("/getById")
    public DataResult<JobTitle> getById(@RequestParam int id)
    {
        return jobTitleService.getById(id);
    }
}
