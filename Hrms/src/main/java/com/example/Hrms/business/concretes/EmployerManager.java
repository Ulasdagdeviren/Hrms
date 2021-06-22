package com.example.Hrms.business.concretes;

import com.example.Hrms.business.abstracts.EmployerService;
import com.example.Hrms.core.utilities.Validation.EmployerValidator;
import com.example.Hrms.core.utilities.fakeService.EmailConfirmationService;
import com.example.Hrms.core.utilities.fakeService.EmailService;
import com.example.Hrms.core.utilities.results.*;
import com.example.Hrms.dataAccess.abstracts.EmployerDao;
import com.example.Hrms.entities.concretes.Employer;
import com.example.Hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.List;

@Service
public class EmployerManager implements EmployerService {
   private EmployerDao dao;
    @Autowired
    public EmployerManager(EmployerDao dao) {
        this.dao = dao;
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<>(dao.findAll(),"Data Listed");
    }

    @Override
    public DataResult<Employer> save(Employer employer) {
        var result= EmployerValidator.requiredField(employer);
        var employerCheckByEmail=checkByEmail(employer.getEmail());
        if (EmailService.sendVerificationEmail(employer.getEmail())&&result.isSuccess()&&
                EmailConfirmationService.emailConfirmationService(employer.getEmail())&&
                employerCheckByEmail.isSuccess()&&webAddressControl(employer.getWebSite(), employer.getEmail()).isSuccess())
        {
            return new SuccessDataResult<>(dao.save(employer),"Save is Success");
        }
        return new ErrorDataResult<>(result.getMessage(),employerCheckByEmail.getMessage());
    }

    public DataResult<JobSeeker> checkByEmail(String email){
        var employer=dao.getByEmail(email);
        if (employer==null)
        {
            return new SuccessDataResult<>();
        }
        return new ErrorDataResult<>("Email is used");
    }
    private Result webAddressControl(String webAddress, String email) {
        String emailSplit= email.split("@")[1];

        if (!webAddress.contains(emailSplit)) {
            return new ErrorResult("email must have the domain of the website.");
        }
        return new SuccessResult();
    }

}
