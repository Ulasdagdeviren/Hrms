package com.example.Hrms.api.controllers;

import com.example.Hrms.business.abstracts.EmployeeService;
import com.example.Hrms.core.utilities.results.DataResult;
import com.example.Hrms.entities.concretes.Employee;
import com.example.Hrms.entities.dtos.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    private EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/getById")
    public DataResult<Employee> getById(@RequestParam int id)
    {
        return employeeService.getById(id);
    }
    @GetMapping("/getDto")
    public DataResult<List<EmployeeDto>> getDto()
    {
        return employeeService.getDto();
    }
}
