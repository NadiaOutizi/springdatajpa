package com.competence.springdata.competence.Entities;


import jakarta.persistence.*;
import lombok.Data;


import java.util.Set;

@Entity
@Data // getters and setters
public class Competence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "competences")
    private Set<CV> cvs;



}
