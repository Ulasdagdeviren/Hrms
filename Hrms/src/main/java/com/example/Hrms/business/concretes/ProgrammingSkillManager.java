package com.example.Hrms.business.concretes;

import com.example.Hrms.business.abstracts.ProgrammingSkillService;
import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.core.utilities.results.SuccessDataResult;
import com.example.Hrms.dataAccess.abstracts.ProgrammingSkillDao;
import com.example.Hrms.entities.concretes.ProgrammingSkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProgrammingSkillManager implements ProgrammingSkillService {
    private ProgrammingSkillDao programmingSkillDao;
    @Autowired
    public ProgrammingSkillManager(ProgrammingSkillDao programmingSkillDao) {
        this.programmingSkillDao = programmingSkillDao;
    }

    @Override
    public DataResult<ProgrammingSkill> getById(int id) {
        return new SuccessDataResult<>(programmingSkillDao.getById(id));
    }

    @Override
    public DataResult<List<ProgrammingSkill>> getByJobSeeker_Id(int jobSeekerId) {
        return new SuccessDataResult<>(programmingSkillDao.getByJobSeeker_Id(jobSeekerId));
    }
}
