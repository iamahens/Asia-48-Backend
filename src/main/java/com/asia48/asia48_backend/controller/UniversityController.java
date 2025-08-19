package com.asia48.asia48_backend.controller;

import com.asia48.asia48_backend.Model.University;
import com.asia48.asia48_backend.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/universities")
public class UniversityController {

    @Autowired
    private UniversityService universityService;

    @GetMapping
    public ResponseEntity<List<University>> getAllUniversities() {
        return ResponseEntity.ok(universityService.getAllUniversities());
    }

    @GetMapping("/{id}")
    public ResponseEntity<University> getUniversityById(@PathVariable Long id) {
        return universityService.getUniversityById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // This endpoint would be secured for admins in a real application
    @PostMapping
    public ResponseEntity<University> createUniversity(@RequestBody University university) {
        return ResponseEntity.ok(universityService.createUniversity(university));
    }
}
