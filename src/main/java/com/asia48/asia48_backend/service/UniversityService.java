package com.asia48.asia48_backend.service;

import com.asia48.asia48_backend.Model.University;
import com.asia48.asia48_backend.Repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UniversityService {

    @Autowired
    private UniversityRepository universityRepository;

    public List<University> getAllUniversities() {
        return universityRepository.findAll();
    }

    public Optional<University> getUniversityById(Long id) {
        return universityRepository.findById(id);
    }

    public University createUniversity(University university) {
        // In a real app, you might add more logic here before saving
        return universityRepository.save(university);
    }
}
