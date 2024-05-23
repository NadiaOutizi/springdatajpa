package com.competence.springdata.competence.Controllers;

import com.competence.springdata.competence.Entities.Competence;
import com.competence.springdata.competence.Services.CompetenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/competences")
public class CompetenceController {


    private final CompetenceService competenceService;

    public CompetenceController(CompetenceService competenceService) {
        this.competenceService = competenceService;
    }

    @GetMapping("/all")
    public List<Competence> getAllCompetences() {
        return competenceService.getAllCompetences();
    }

    @GetMapping("/{id}")
    public Competence getCompetenceById(@PathVariable Long id) {
        return competenceService.getCompetenceById(id);
    }

    @PostMapping("/create")
    public Competence createCompetence(@RequestBody Competence competence) {
        return competenceService.saveOrUpdateCompetence(competence);
    }

    @PutMapping("/{id}")
    public Competence updateCompetence(@PathVariable Long id, @RequestBody Competence competence) {
        return competenceService.saveOrUpdateCompetence(competence);
    }

    @DeleteMapping("/{id}")
    public void deleteCompetence(@PathVariable Long id) {
        competenceService.deleteCompetence(id);
    }
}