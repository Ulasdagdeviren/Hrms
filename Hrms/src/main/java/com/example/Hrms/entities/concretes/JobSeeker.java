package com.example.Hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Local;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "candidates")
@Data
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class JobSeeker extends User{
    @NotNull(message = "firstName is a required field ")
    @Column(name="first_name")
    private String firstName;
    @NotNull(message = "lastName is a required field ")
    @Column(name="last_name")
    private String lastName;

    @Column(name="identity_number")
    private String identityNumber;
    @NotNull(message = "birthday is a required field ")
    @Column(name="birth_date")
    private Date birthDate;
    @Column(name = "application_deadline")
    private LocalDate applicationDeadline;
    @Transient //It means that a field in the Entity class will not have a column counterpart in the database.
    private String verifyPassword;

    @JsonIgnore
    @OneToMany(mappedBy = "jobSeeker")
    private List<School> schools;

    @JsonIgnore
    @OneToMany(mappedBy = "jobSeeker")
    private List<Language> languages;


    @JsonIgnore
    @OneToMany(mappedBy = "jobSeeker")
    private List<ProgrammingSkill> programmingSkills;

    @JsonIgnore
    @OneToMany(mappedBy = "jobSeeker")
    private List<JobExperience> experiences;

    @JsonIgnore
    @OneToMany(mappedBy = "jobSeeker")
    private List<SocialMediaAccount> socialMediaAccounts;



}
