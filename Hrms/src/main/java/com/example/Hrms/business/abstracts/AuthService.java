package com.example.Hrms.business.abstracts;

import com.example.Hrms.core.entity.Dto.LoginDto;
import com.example.Hrms.core.utilities.results.SuccessResult;
import com.example.Hrms.entities.concretes.User;
import io.swagger.annotations.ApiResponse;


public interface AuthService {
    SuccessResult login(LoginDto loginDto);


}
