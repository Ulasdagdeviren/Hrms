package com.example.Hrms.dataAccess.abstracts;

import com.example.Hrms.entities.concretes.SocialMediaAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SocialMediaAccountDao extends JpaRepository<SocialMediaAccount,Integer> {
    List<SocialMediaAccount> getByJobSeeker_Id(int jobSeekerId);
}
