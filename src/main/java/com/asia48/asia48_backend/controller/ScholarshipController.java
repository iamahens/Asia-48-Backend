package com.asia48.asia48_backend.controller;

import com.asia48.asia48_backend.Model.Scholarship;
import com.asia48.asia48_backend.service.ScholarshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/scholarships")
public class ScholarshipController {

    @Autowired
    private ScholarshipService scholarshipService;

    @GetMapping
    public ResponseEntity<List<Scholarship>> getAllScholarships() {
        return ResponseEntity.ok(scholarshipService.getAllScholarships());
    }

    @GetMapping("/country/{country}")
    public ResponseEntity<List<Scholarship>> getScholarshipsByCountry(@PathVariable String country) {
        return ResponseEntity.ok(scholarshipService.getScholarshipsByCountry(country));
    }

    @PostMapping
    public ResponseEntity<Scholarship> createScholarship(@RequestBody Scholarship scholarship) {
        return ResponseEntity.ok(scholarshipService.createScholarship(scholarship));
    }
}
