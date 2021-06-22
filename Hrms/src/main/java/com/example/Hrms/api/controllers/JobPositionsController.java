package com.example.Hrms.api.controllers;

import com.example.Hrms.business.abstracts.JobPositionService;
import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jobPositions")
public class JobPositionsController {

   private JobPositionService service;
    @Autowired
    public JobPositionsController(JobPositionService service) {
        this.service = service;
    }
    @PostMapping("/add")
    public DataResult<JobPosition> add(@RequestBody JobPosition jobPosition)
    {
        return service.add(jobPosition);
    }
}
