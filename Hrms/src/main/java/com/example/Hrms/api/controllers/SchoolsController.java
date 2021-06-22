package com.example.Hrms.api.controllers;

import com.example.Hrms.business.abstracts.SchoolService;
import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.entities.concretes.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/schools")
public class SchoolsController {
    private SchoolService schoolService;
    @Autowired
    public SchoolsController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }
    @GetMapping("/getById")
    public DataResult<School> getById(@RequestParam int id)
    {
        return schoolService.getById(id);
    }
    @GetMapping("/getByJobSeeker_Id")
    public DataResult<List<School>> getByJobSeeker_Id(@RequestParam int jobSeekerId)
    {
        return schoolService.getByJobSeeker_Id(jobSeekerId);
    }
}
