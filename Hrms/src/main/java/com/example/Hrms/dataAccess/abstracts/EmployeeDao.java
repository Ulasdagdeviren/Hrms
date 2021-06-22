package com.example.Hrms.dataAccess.abstracts;

import com.example.Hrms.entities.concretes.Employee;
import com.example.Hrms.entities.dtos.EmployeeDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {
    Employee getById(int id);
    @Query("Select new  com.example.Hrms.entities.dtos.EmployeeDto"
            + "(e.firstName,e.lastName,e.email,i.url) "
            + "From Employee e Inner Join e.images i")
    List<EmployeeDto> getDto();
}

