package com.example.Hrms.business.abstracts;

import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.entities.concretes.JobPosition;

import javax.xml.crypto.Data;
import java.util.List;

public interface JobPositionService {
    DataResult<JobPosition> add(JobPosition jobPosition);
    DataResult<JobPosition> positionRepetition(String position);
    DataResult<List<JobPosition>> getAll();
}
