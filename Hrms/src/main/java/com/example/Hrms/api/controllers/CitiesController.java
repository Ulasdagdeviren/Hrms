package com.example.Hrms.api.controllers;

import com.example.Hrms.business.abstracts.CityService;
import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.entities.concretes.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cities")
public class CitiesController {
   private CityService cityService;
    @Autowired
    public CitiesController(CityService cityService) {
        this.cityService = cityService;
    }
    @GetMapping("/findById")
    public DataResult<City> findById(@RequestParam int id)
    {
        return cityService.findById(id);
    }
}
