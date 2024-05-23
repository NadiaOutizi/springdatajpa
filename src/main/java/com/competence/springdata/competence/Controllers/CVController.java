package com.competence.springdata.competence.Controllers;
import com.competence.springdata.competence.Entities.CV;
import com.competence.springdata.competence.Services.CVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/cvs")
public class CVController {
    @Autowired
    private CVService cvService;

    @GetMapping("/all")
    public List<CV> getAllCVs() {
        return cvService.getAllCVs();
    }

    @GetMapping("/{id}")
    public CV getCVById(@PathVariable Long id) {
        return cvService.getCVById(id);
    }

    @PostMapping("/create")
    public CV createCV(@RequestBody CV cv) {
        return cvService.saveOrUpdateCV(cv);
    }

    @PutMapping("/{id}")
    public CV updateCV(@PathVariable Long id, @RequestBody CV cv) {
        cv.setId(id);
        return cvService.saveOrUpdateCV(cv);
    }

    @DeleteMapping("/{id}")
    public void deleteCV(@PathVariable Long id) {
        cvService.deleteCV(id);
    }
}
