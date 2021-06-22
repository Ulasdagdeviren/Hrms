package com.example.Hrms.business.abstracts;

import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.entities.concretes.Employee;
import com.example.Hrms.entities.dtos.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    DataResult<Employee> getById(int id);
    DataResult<List<EmployeeDto>> getDto();
}
