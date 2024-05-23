package com.competence.springdata.competence.Repositories;

import com.competence.springdata.competence.Entities.Competence;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public interface CompetenceRepository extends JpaRepository<Competence, Long> {
}
