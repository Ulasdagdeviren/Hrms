package com.example.Hrms.api.controllers;

import com.example.Hrms.business.abstracts.ProgrammingSkillService;
import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.entities.concretes.ProgrammingSkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/programmingSkills")
public class ProgrammingSkillsController {
    private ProgrammingSkillService programmingSkillService;
    @Autowired
    public ProgrammingSkillsController(ProgrammingSkillService programmingSkillService) {
        this.programmingSkillService = programmingSkillService;
    }
    @GetMapping("/getById")
    public DataResult<ProgrammingSkill> getById(@RequestParam int id)
    {
        return programmingSkillService.getById(id);
    }
    @GetMapping("/getByJobSeeker_Id")
    public  DataResult<List<ProgrammingSkill>> getByJobSeeker_Id(@RequestParam int jobSeekerId)
    {
        return programmingSkillService.getByJobSeeker_Id(jobSeekerId);
    }
}
