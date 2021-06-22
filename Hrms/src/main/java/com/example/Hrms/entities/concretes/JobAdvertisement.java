package com.example.Hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Table(name = "job_adverts")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisement"})
public class JobAdvertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "description")
    private String description;
    @Column(name = "quota")
    private int quota;
    @Column(name = "created_date")
    private Date created_date;
    @Column(name = "min_salary")
    private double minSalary;
    @Column(name = "max_salary")
    private double maxSalary;
    @Column(name = "is_active")
    private boolean isActive=false;

    @ManyToOne()
    @JoinColumn(name = "employer_id")
    private Employer employer;
    @ManyToOne()
    @JoinColumn(name = "job_position_id")
    private JobPosition jobPosition;
    @ManyToOne()
    @JoinColumn(name = "job_title_id")
    private JobTitle jobTitle;
    @ManyToOne()
    @JoinColumn(name = "city_id")
    private City city;

}
