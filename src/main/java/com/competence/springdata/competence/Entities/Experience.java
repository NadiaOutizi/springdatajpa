package com.competence.springdata.competence.Entities;

import jakarta.persistence.*;

import lombok.Data;


@Entity
@Data
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String company;

    @ManyToOne
    @JoinColumn(name = "cv_id", nullable = false)
    private CV cv;

    public void setId(Long id) {
    }
}