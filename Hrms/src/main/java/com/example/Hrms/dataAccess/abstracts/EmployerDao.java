package com.example.Hrms.dataAccess.abstracts;

import com.example.Hrms.entities.concretes.Employer;
import com.example.Hrms.entities.dtos.EmployerDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployerDao extends JpaRepository<Employer,Integer> {
    Employer getByEmail(String email);
    @Query("Select new  com.example.Hrms.entities.dtos.EmployeeDto"
            + "(e.companyName,e.webSite,e.telephoneNumber,e.email) "
            + "From Employer e Inner Join e.images i")
    List<EmployerDto> getDto();
}
