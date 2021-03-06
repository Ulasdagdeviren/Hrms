package com.example.Hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employer_confirmed_by_employee")
public class EmployerConfirmedByEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "employer_id")
    private int employerId;

    @Column(name="is_confirmed",columnDefinition="boolean default false")
    private boolean isConfirmed;
}
