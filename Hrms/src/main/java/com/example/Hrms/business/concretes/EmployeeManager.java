package com.example.Hrms.business.concretes;

import com.example.Hrms.business.abstracts.EmployeeService;
import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.core.utilities.results.SuccessDataResult;
import com.example.Hrms.dataAccess.abstracts.EmployeeDao;
import com.example.Hrms.entities.concretes.Employee;
import com.example.Hrms.entities.dtos.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeManager implements EmployeeService {
    private EmployeeDao employeedao;
    @Autowired
    public EmployeeManager(EmployeeDao employeedao) {
        this.employeedao = employeedao;
    }

    @Override
    public DataResult<Employee> getById(int id) {
        return new SuccessDataResult<>(employeedao.getById(id));
    }

    @Override
    public DataResult<List<EmployeeDto>> getDto() {
        return new SuccessDataResult<>(employeedao.getDto());
    }
}
