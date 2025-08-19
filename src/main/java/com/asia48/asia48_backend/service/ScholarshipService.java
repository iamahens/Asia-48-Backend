package com.asia48.asia48_backend.service;

import com.asia48.asia48_backend.Model.Scholarship;
import com.asia48.asia48_backend.Repository.ScholarshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScholarshipService {

    @Autowired
    private ScholarshipRepository scholarshipRepository;

    public List<Scholarship> getAllScholarships() {
        return scholarshipRepository.findAll();
    }

    public List<Scholarship> getScholarshipsByCountry(String country) {
        return scholarshipRepository.findByCountry(country);
    }

    public Scholarship createScholarship(Scholarship scholarship) {
        // In a real app, you might add more logic here before saving
        return scholarshipRepository.save(scholarship);
    }
}
