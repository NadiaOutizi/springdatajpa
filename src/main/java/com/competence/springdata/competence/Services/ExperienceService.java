package com.competence.springdata.competence.Services;

import com.competence.springdata.competence.Entities.Experience;
import com.competence.springdata.competence.Repositories.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService {
    @Autowired
    private ExperienceRepository experienceRepository;

    // Method to get all experiences
    public List<Experience> getAllExperiences() {
        return experienceRepository.findAll();
    }

    // Method to get an experience by ID
    public Experience getExperienceById(Long id) {
        return experienceRepository.findById(id).orElse(null);
    }

    // Method to save or update an experience
    public Experience saveOrUpdateExperience(Experience experience) {
        return experienceRepository.save(experience);
    }

    // Method to delete an experience by ID
    public void deleteExperience(Long id) {
        experienceRepository.deleteById(id);
    }
}
