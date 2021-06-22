package com.example.Hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "job_positions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPosition {
    @GeneratedValue
    @Column(name = "id")
    @Id
    private int id;
    @Column(name = "position_name")
    private String positionName;
}
