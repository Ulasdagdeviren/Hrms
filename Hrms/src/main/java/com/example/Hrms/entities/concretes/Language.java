package com.example.Hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "languages")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column(name = "langauge")
    private String language;

    @Min(value = 1)
    @Max(value = 5)
    @Column(name = "level")
    private int level;

    @ManyToOne
    @JoinColumn(name = "jobSeeker_id")
    private JobSeeker jobSeeker;
}