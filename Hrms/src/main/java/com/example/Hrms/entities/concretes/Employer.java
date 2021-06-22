package com.example.Hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;


@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisement"})
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
@Table(name="employers")
public class Employer extends User{


    @Column(name="company_name")
    @NotNull(message = "companyName is a required field ")
    private String companyName;
    @NotNull(message = "webSite is a required field ")
    @Column(name="web_address")
    private String webSite;
    @Column(name="phone_number")
    @NotNull(message = "telephoneNumber is a required field ")
    private String telephoneNumber;
    @Transient //It means that a field in the Entity class will not have a column counterpart in the database.
    private String verifyPassword;
   @OneToMany(mappedBy = "employer")
    private List<JobAdvertisement> jobAdvertisement;
}
