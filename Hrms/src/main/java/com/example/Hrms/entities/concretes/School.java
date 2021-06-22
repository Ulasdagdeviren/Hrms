package com.example.Hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Data
@Table(name = "schools")
@NoArgsConstructor
@AllArgsConstructor

public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="school_name")
    private String schoolName;

    @Column(name="department")
    private String department;

    @Column(name="starting_date")
    private LocalDate startingDate;

    @Column(name="graduated_date")
    private LocalDate graduatedDate;

    @ManyToOne
    @JoinColumn(name = "jobSeeker_id")
    private JobSeeker jobSeeker;
}
