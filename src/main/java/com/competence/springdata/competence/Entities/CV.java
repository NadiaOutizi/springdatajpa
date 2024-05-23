package com.competence.springdata.competence.Entities;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Entity
@Data
public class CV {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserInfo userInfo;

    @ManyToMany
    @JoinTable(
            name = "cv_competence",
            joinColumns = @JoinColumn(name = "cv_id"),
            inverseJoinColumns = @JoinColumn(name = "competence_id"))
    private Set<Competence> competences;

    @OneToMany(mappedBy = "cv")
    private Set<Experience> experiences;

    public void setId(Long id) {

    }
}