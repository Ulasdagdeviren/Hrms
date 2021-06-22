package com.example.Hrms.business.abstracts;

import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.entities.concretes.Language;

import java.util.List;

public interface LanguageService {
   DataResult<List<Language>> getByJobSeeker_Id(int jobSeekerId);
}
