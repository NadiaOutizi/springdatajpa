package com.competence.springdata.competence.Services;

import com.competence.springdata.competence.Entities.Competence;
import com.competence.springdata.competence.Repositories.CompetenceRepository;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetenceService {


    private final CompetenceRepository competenceRepository;

    public CompetenceService(CompetenceRepository competenceRepository) {
        this.competenceRepository = competenceRepository;
    }

    public List<Competence> getAllCompetences() {
        return competenceRepository.findAll();
    }

    public Competence getCompetenceById(Long id) {
        return competenceRepository.findById(id).orElse(null);
    }


    public Competence saveOrUpdateCompetence(Competence competence) {
        return competenceRepository.save(competence);
    }

    public void deleteCompetence(Long id) {
        competenceRepository.deleteById(id);
    }
}
