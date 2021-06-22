package com.example.Hrms.dataAccess.abstracts;

import com.example.Hrms.entities.concretes.JobExperience;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobExperienceDao extends JpaRepository<JobExperience,Integer> {
    JobExperience getById(int id);
    List<JobExperience> getByJobSeeker_Id(int jobSeekerId);
}
