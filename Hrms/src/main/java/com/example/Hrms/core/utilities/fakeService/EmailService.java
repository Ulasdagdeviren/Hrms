package com.example.Hrms.core.utilities.fakeService;

import com.example.Hrms.entities.concretes.JobSeeker;
import org.springframework.stereotype.Component;

@Component
public class EmailService {

    public static boolean sendVerificationEmail(String email) {
        return true;
    }
}
