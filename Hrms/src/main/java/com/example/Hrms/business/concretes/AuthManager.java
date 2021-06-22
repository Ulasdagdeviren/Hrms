package com.example.Hrms.business.concretes;

import com.example.Hrms.business.abstracts.AuthService;
import com.example.Hrms.core.entity.Dto.LoginDto;
import com.example.Hrms.core.utilities.results.SuccessResult;
import com.example.Hrms.dataAccess.abstracts.UserDao;
import com.example.Hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthManager implements AuthService {

    private UserDao userDao;
    @Autowired
    public AuthManager(UserDao userDao) {
        super();
        this.userDao = userDao;
    }


    @Override
    public SuccessResult login(LoginDto loginDto) {
        User user=userDao.findByEmailAndPassword(loginDto.getEmail(),loginDto.getPassword());
        if(user == null) {
            throw new RuntimeException("User does not exist.");
        }
        if(!user.getPassword().equals(loginDto.getPassword())){
            throw new RuntimeException("Password mismatch.");
        }
        return new SuccessResult("Login is Success");
    }

}
