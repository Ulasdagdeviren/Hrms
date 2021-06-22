package com.example.Hrms.dataAccess.abstracts;

import com.example.Hrms.entities.concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerDao extends JpaRepository<JobSeeker,Integer> {
    JobSeeker getByIdentityNumber(String identityNumber);
    JobSeeker getByEmail(String email);

}
