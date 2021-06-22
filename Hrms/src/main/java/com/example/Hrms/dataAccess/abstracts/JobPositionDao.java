package com.example.Hrms.dataAccess.abstracts;

import com.example.Hrms.entities.concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer> {
    JobPosition getByPositionName(String positionName);
}
