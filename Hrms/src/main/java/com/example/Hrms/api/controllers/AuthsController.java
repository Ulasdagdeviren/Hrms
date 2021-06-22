package com.example.Hrms.api.controllers;

import com.example.Hrms.business.abstracts.AuthService;
import com.example.Hrms.core.entity.Dto.LoginDto;
import com.example.Hrms.core.utilities.results.Result;
import com.example.Hrms.core.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/auths")
public class AuthsController {

   private AuthService authService;

    @Autowired
    public AuthsController(AuthService authService) {
        this.authService = authService;
    }


    @PostMapping("/login")
    public ResponseEntity<?> login(@Valid @RequestBody LoginDto loginDto)
    {
        return ResponseEntity.ok(authService.login(loginDto));
    }



}
