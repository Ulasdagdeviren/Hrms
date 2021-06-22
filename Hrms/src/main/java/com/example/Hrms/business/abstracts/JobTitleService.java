package com.example.Hrms.business.abstracts;

import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.entities.concretes.JobTitle;

public interface JobTitleService {
    DataResult<JobTitle> getById(int id);
}
