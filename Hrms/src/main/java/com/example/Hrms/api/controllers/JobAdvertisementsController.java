package com.example.Hrms.api.controllers;

import com.example.Hrms.business.abstracts.JobAdvertisementService;
import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobAdvertisements")
public class JobAdvertisementsController {
   private JobAdvertisementService service;
    @Autowired
    public JobAdvertisementsController(JobAdvertisementService service) {
        this.service = service;
    }
    @PostMapping("/add")
    public DataResult<JobAdvertisement> add(@RequestBody JobAdvertisement jobAdvertisement)
    {
        return service.add(jobAdvertisement);
    }
    @GetMapping("/getAll")
    public DataResult<List<JobAdvertisement>> getAll()
    {
        return service.getAll();
    }
    @GetMapping("/CreatedDateGetAll")
    public DataResult<List<JobAdvertisement>> getByCreated_date()
    {
        return service.getByCreated_date();
    }
    @GetMapping("/getByActive")
    public DataResult<List<JobAdvertisement>> getByActive(boolean active){
        return service.getByActive(active);
    }



}
