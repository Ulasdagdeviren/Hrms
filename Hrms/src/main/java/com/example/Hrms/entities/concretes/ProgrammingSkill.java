package com.example.Hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "programming_skills")
public class ProgrammingSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "programming_name")
    private String programmingName;

    @ManyToOne
    @JoinColumn(name = "jobSeeker_id")
    private JobSeeker jobSeeker;

}
