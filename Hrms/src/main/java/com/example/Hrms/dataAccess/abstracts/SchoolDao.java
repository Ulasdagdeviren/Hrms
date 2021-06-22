package com.example.Hrms.dataAccess.abstracts;

import com.example.Hrms.entities.concretes.School;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchoolDao extends JpaRepository<School,Integer> {
    School getById(int id);
    List<School> getByJobSeeker_Id(int jobSeekerId);
}
