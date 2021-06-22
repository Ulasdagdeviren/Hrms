package com.example.Hrms.api.controllers;

import com.example.Hrms.business.abstracts.UserService;
import com.example.Hrms.entities.concretes.User;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    private UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/getall")
    public List<User> getAll(){
        return this.userService.getAll();
    }

   @GetMapping("/getById")
    public User getByEmailAndUserid(@RequestParam int id){
        return this.userService.getById(id);
    }



}
