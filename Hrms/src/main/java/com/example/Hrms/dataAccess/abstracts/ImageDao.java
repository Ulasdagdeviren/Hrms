package com.example.Hrms.dataAccess.abstracts;

import com.example.Hrms.entities.concretes.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageDao extends JpaRepository<Image,Integer> {
    Image getByUser_Id(int userId);
}
