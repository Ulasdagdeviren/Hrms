package com.example.Hrms.dataAccess.abstracts;

import com.example.Hrms.entities.concretes.ProgrammingSkill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProgrammingSkillDao extends JpaRepository<ProgrammingSkill,Integer> {
    ProgrammingSkill getById(int id);
    List<ProgrammingSkill> getByJobSeeker_Id(int jobSeekerId);
}
