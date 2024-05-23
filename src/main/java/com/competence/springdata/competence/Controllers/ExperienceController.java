package com.competence.springdata.competence.Controllers;

import com.competence.springdata.competence.Entities.Experience;
import com.competence.springdata.competence.Services.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/experiences")
public class ExperienceController {
    @Autowired
    private ExperienceService experienceService;

    @GetMapping("/all")
    public List<Experience> getAllExperiences() {
        return experienceService.getAllExperiences();
    }

    @GetMapping("/{id}")
    public Experience getExperienceById(@PathVariable Long id) {
        return experienceService.getExperienceById(id);
    }

    @PostMapping("/create")
    public Experience createExperience(@RequestBody Experience experience) {
        return experienceService.saveOrUpdateExperience(experience);
    }

    @PutMapping("/{id}")
    public Experience updateExperience(@PathVariable Long id, @RequestBody Experience experience) {
        experience.setId(id);
        return experienceService.saveOrUpdateExperience(experience);
    }

    @DeleteMapping("/{id}")
    public void deleteExperience(@PathVariable Long id) {
        experienceService.deleteExperience(id);
    }
}