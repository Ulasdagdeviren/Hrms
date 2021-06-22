package com.example.Hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
@Data
@Entity
@Table(name = "job_experience")
@NoArgsConstructor
@AllArgsConstructor
public class JobExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "workplace")
    private String workplace;
    @Column(name = "position")
    private String position;
    @Column(name = "starting_date")
    private LocalDate startingDate;
    @Column(name = "end_date")
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "jobSeeker_id")
    private JobSeeker jobSeeker;

}
