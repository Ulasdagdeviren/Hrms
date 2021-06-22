package com.example.Hrms.dataAccess.abstracts;

import com.example.Hrms.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
    User findByEmailAndPassword(String email,String password);
    User findById(int id);



}
