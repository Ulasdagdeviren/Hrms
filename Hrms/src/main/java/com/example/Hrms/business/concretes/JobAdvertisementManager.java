package com.example.Hrms.business.concretes;

import com.example.Hrms.business.abstracts.JobAdvertisementService;
import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.core.utilities.results.SuccessDataResult;
import com.example.Hrms.dataAccess.abstracts.JobAdvertisementDao;
import com.example.Hrms.entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {
   private JobAdvertisementDao jobAdvertisementDao;
    @Autowired
    public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
        this.jobAdvertisementDao = jobAdvertisementDao;
    }

    @Override
    public DataResult<JobAdvertisement> add(JobAdvertisement jobAdvertisement) {
        return new SuccessDataResult<>(jobAdvertisementDao.save(jobAdvertisement),"Save is Success");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAll() {
        return new SuccessDataResult<>(jobAdvertisementDao.findAll(),"Data listed");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getByCreated_date() {
        Sort sort = Sort.by(Sort.Direction.DESC,"created_date");
        return new SuccessDataResult<>(jobAdvertisementDao.findAll(),"Data listed");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getByActive(boolean active) {
        return new SuccessDataResult<>(jobAdvertisementDao.getByActive(active));
    }


}
