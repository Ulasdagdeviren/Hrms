package com.example.Hrms.api.controllers;

import com.example.Hrms.business.abstracts.ImageService;
import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.entities.concretes.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/images")
public class ImagesController {
    private ImageService imageService;
    @Autowired
    public ImagesController(@RequestParam ImageService imageService) {
        this.imageService = imageService;
    }
    @GetMapping("/getByUser_Id")
    public DataResult<Image> getByUser_Id( @RequestParam int userId)
    {
        return imageService.getByUser_Id(userId);
    }


}
