package com.example.Hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "social_media")
@NoArgsConstructor
@AllArgsConstructor
public class SocialMediaAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "link")
    private String link;
    @ManyToOne
    @JoinColumn(name = "jobSeeker_id")
    private JobSeeker jobSeeker;
}
