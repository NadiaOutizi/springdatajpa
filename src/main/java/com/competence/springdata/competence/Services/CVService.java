package com.competence.springdata.competence.Services;

import com.competence.springdata.competence.Entities.CV;
import com.competence.springdata.competence.Repositories.CVRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CVService {

    @Autowired
    private CVRepository cvRepository;

    public List<CV> getAllCVs() {
        return cvRepository.findAll();
    }

    public CV getCVById(Long id) {
        return cvRepository.findById(id).orElse(null);
    }

    public CV saveOrUpdateCV(CV cv) {
        return cvRepository.save(cv);
    }

    public void deleteCV(Long id) {
        cvRepository.deleteById(id);
    }
}
