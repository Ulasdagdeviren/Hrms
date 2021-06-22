package com.example.Hrms.business.abstracts;

import com.example.Hrms.entities.concretes.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getById(int id);
}
