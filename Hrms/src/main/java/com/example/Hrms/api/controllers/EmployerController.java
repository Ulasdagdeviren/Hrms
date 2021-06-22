package com.example.Hrms.api.controllers;

import com.example.Hrms.business.abstracts.EmployerService;
import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employers")
public class EmployerController {
   private EmployerService employerService;
    @Autowired
    public EmployerController(EmployerService employerService) {
        this.employerService = employerService;
    }
    @PostMapping("/add")
    public DataResult<Employer> add(@RequestBody Employer employer){
        return employerService.save(employer);
    }
}
