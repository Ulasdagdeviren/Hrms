package com.example.Hrms.business.concretes;

import com.example.Hrms.business.abstracts.SocialMediaService;
import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.core.utilities.results.SuccessDataResult;
import com.example.Hrms.dataAccess.abstracts.SocialMediaAccountDao;
import com.example.Hrms.entities.concretes.SocialMediaAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SocialMediaManager implements SocialMediaService {
    private SocialMediaAccountDao socialMediaAccountDao;
    @Autowired
    public SocialMediaManager(SocialMediaAccountDao socialMediaAccountDao) {
        this.socialMediaAccountDao = socialMediaAccountDao;
    }

    @Override
    public DataResult<List<SocialMediaAccount>> getByJobSeeker_Id(int jobSeekerId) {
        return new SuccessDataResult<>(socialMediaAccountDao.getByJobSeeker_Id(jobSeekerId));
    }
}
