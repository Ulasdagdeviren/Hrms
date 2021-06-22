package com.example.Hrms.business.concretes;

import com.example.Hrms.business.abstracts.JobSeekerService;

import com.example.Hrms.core.utilities.fakeService.EmailService;
import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.core.utilities.results.ErrorDataResult;
import com.example.Hrms.core.utilities.results.SuccessDataResult;
import com.example.Hrms.dataAccess.abstracts.JobSeekerDao;
import com.example.Hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerManager implements JobSeekerService {
   private JobSeekerDao jobSeekerDao;


    @Autowired
    public JobSeekerManager(JobSeekerDao jobSeekerDao) {
        this.jobSeekerDao = jobSeekerDao;
    }


    @Override
    public DataResult<JobSeeker> Save(JobSeeker jobSeeker) {

       var email=checkByEmail(jobSeeker.getEmail()) ;
       var control=identityVerify(jobSeeker.getIdentityNumber());
        if (control.isSuccess()&& email.isSuccess()&& EmailService.sendVerificationEmail(jobSeeker.getEmail()))
        {
            return new SuccessDataResult<>(jobSeekerDao.save(jobSeeker), "Save is Success");
        }
        return new ErrorDataResult<>(control.getMessage(), email.getMessage());
    }

    @Override
    public DataResult<List<JobSeeker>> getAll() {
        return new SuccessDataResult<>(jobSeekerDao.findAll(),"Data Listed");
    }

    public DataResult<JobSeeker> identityVerify(String identity)
    {
        var jobSeeker= jobSeekerDao.getByIdentityNumber(identity);
        if (jobSeeker==null)
        {
            return new SuccessDataResult<>();
        }
        return new ErrorDataResult<>("Identity number is used");
    }
  public DataResult<JobSeeker> checkByEmail(String email){
        var jobSeeker=jobSeekerDao.getByEmail(email);
        if (jobSeeker==null)
        {
            return new SuccessDataResult<>();
        }
      return new ErrorDataResult<>("Email is used");
  }




}
