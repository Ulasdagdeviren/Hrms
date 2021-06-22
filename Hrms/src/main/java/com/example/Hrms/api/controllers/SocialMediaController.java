package com.example.Hrms.api.controllers;

import com.example.Hrms.business.abstracts.SocialMediaService;
import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.entities.concretes.SocialMediaAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/socialMedia")
public class SocialMediaController {
    private SocialMediaService socialMediaService;
    @Autowired
    public SocialMediaController(SocialMediaService socialMediaService) {
        this.socialMediaService = socialMediaService;
    }
    @GetMapping("/getByJobSeeker_Id")
    public DataResult<List<SocialMediaAccount>> getByJobSeeker_Id(@RequestParam int jobSeekerId)
    {
        return socialMediaService.getByJobSeeker_Id(jobSeekerId);
    }
}
