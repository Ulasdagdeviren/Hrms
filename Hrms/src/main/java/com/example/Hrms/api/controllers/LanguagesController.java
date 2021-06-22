package com.example.Hrms.api.controllers;

import com.example.Hrms.business.abstracts.LanguageService;
import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/languages")
@RestController
public class LanguagesController {
    private LanguageService languageService;
    @Autowired
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }
    @GetMapping("/getByJobSeeker_Id")
    public DataResult<List<Language>> getByJobSeeker_Id(@RequestParam int jobSeekerId)
    {
        return languageService.getByJobSeeker_Id(jobSeekerId);
    }
}
