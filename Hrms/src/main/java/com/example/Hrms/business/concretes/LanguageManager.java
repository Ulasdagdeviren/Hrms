package com.example.Hrms.business.concretes;

import com.example.Hrms.business.abstracts.LanguageService;
import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.core.utilities.results.SuccessDataResult;
import com.example.Hrms.dataAccess.abstracts.LanguageDao;
import com.example.Hrms.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LanguageManager implements LanguageService {
    private LanguageDao languageDao;
    @Autowired
    public LanguageManager(LanguageDao languageDao) {
        this.languageDao = languageDao;
    }

    @Override
    public DataResult<List<Language>> getByJobSeeker_Id(int jobSeekerId) {
        return new SuccessDataResult<>(languageDao.getByJobSeeker_Id(jobSeekerId));
    }
}
