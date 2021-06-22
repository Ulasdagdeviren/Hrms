package com.example.Hrms.dataAccess.abstracts;

import com.example.Hrms.entities.concretes.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer> {
    JobTitle getById(int id);
}
