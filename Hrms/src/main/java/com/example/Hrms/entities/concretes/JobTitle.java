package com.example.Hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_titles")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisement"})

public class JobTitle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_title_id")
    private int id;
    @Column(name = "title")
    private String title;
    @OneToMany(mappedBy = "jobTitle")
    private List<JobAdvertisement> jobAdvertisement;
}
