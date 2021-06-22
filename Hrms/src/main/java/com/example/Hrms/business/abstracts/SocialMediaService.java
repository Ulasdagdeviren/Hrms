package com.example.Hrms.business.abstracts;

import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.entities.concretes.SocialMediaAccount;

import java.util.List;

public interface SocialMediaService {
    DataResult<List<SocialMediaAccount>> getByJobSeeker_Id(int jobSeekerId);
}
