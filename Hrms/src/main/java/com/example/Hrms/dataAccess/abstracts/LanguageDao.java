package com.example.Hrms.dataAccess.abstracts;

import com.example.Hrms.entities.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LanguageDao extends JpaRepository<Language,Integer> {
    List<Language> getByJobSeeker_Id(int jobSeekerId);
}
