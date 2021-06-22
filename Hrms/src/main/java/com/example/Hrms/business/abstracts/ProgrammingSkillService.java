package com.example.Hrms.business.abstracts;

import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.entities.concretes.ProgrammingSkill;

import java.util.List;

public interface ProgrammingSkillService {
    DataResult<ProgrammingSkill> getById(int id);
    DataResult<List<ProgrammingSkill>> getByJobSeeker_Id(int jobSeekerId);
}
