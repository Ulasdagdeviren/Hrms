package com.example.Hrms.business.concretes;

import com.example.Hrms.business.abstracts.JobPositionService;
import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.core.utilities.results.ErrorDataResult;
import com.example.Hrms.core.utilities.results.SuccessDataResult;
import com.example.Hrms.dataAccess.abstracts.JobPositionDao;
import com.example.Hrms.entities.concretes.JobPosition;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPositionManager implements JobPositionService {
    private JobPositionDao jobPositionDao;

    public JobPositionManager(JobPositionDao jobPositionDao) {
        this.jobPositionDao = jobPositionDao;
    }


    @Override
    public DataResult<JobPosition> add(JobPosition jobPosition) {
        var position=positionRepetition(jobPosition.getPositionName());
        if (position.isSuccess())
        {
            return new SuccessDataResult<>(jobPositionDao.save(jobPosition),"Save is success");
        }
      return new ErrorDataResult<>(position.getMessage());
    }

    @Override
    public DataResult<JobPosition> positionRepetition(String positionName){
        var position=jobPositionDao.getByPositionName(positionName);
        if (position==null)
        {
            return new SuccessDataResult<>("Job Position Not used before");
        }
        return new ErrorDataResult<>("job position used");
    }

    @Override
    public DataResult<List<JobPosition>> getAll() {
        return new SuccessDataResult<>(jobPositionDao.findAll(),"Data Listed");
    }
}
