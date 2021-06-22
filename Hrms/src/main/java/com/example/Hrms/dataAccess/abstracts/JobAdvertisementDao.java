package com.example.Hrms.dataAccess.abstracts;

import com.example.Hrms.entities.concretes.JobAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {
 List<JobAdvertisement> getByActive(boolean active);
}
