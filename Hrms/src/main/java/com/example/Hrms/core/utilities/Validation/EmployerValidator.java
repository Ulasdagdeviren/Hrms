package com.example.Hrms.core.utilities.Validation;

import com.example.Hrms.core.utilities.results.ErrorResult;
import com.example.Hrms.core.utilities.results.Result;
import com.example.Hrms.core.utilities.results.SuccessResult;
import com.example.Hrms.entities.concretes.Employer;


public class EmployerValidator {
    public static Result requiredField (Employer employer){

        if (employer.getPassword().equals(employer.getVerifyPassword()))
        {
            return new SuccessResult();
        }
        return  new ErrorResult("trust not success");

    }
}
