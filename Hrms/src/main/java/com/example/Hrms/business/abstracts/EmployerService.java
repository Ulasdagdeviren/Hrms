package com.example.Hrms.business.abstracts;

import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.entities.concretes.Employer;

import java.util.List;


public interface EmployerService {
    DataResult<List<Employer>> getAll();
    DataResult<Employer> save(Employer employee);


}
