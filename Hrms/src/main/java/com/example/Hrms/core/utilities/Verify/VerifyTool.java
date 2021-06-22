package com.example.Hrms.core.utilities.Verify;

import com.example.Hrms.dataAccess.abstracts.JobSeekerDao;

public class VerifyTool {
    private JobSeekerDao jobSeekerDao;

    public VerifyTool(JobSeekerDao jobSeekerDao) {
        this.jobSeekerDao = jobSeekerDao;
    }

}
