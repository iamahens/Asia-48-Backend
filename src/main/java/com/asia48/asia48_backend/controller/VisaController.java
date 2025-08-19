package com.asia48.asia48_backend.controller;

import com.asia48.asia48_backend.Model.Visa;
import com.asia48.asia48_backend.service.VisaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/visas")
public class VisaController {

    @Autowired
    private VisaService visaService;

    @GetMapping
    public ResponseEntity<List<Visa>> getVisas(
            @RequestParam(required = false) String country,
            @RequestParam(required = false) String type) {
        List<Visa> visas = visaService.getVisasFiltered(country, type);
        return ResponseEntity.ok(visas);
    }

    @GetMapping("/type/{type}")
    public ResponseEntity<List<Visa>> getVisasByType(@PathVariable String type) {
        List<Visa> visas = visaService.getVisasByType(type);
        return ResponseEntity.ok(visas);
    }

    @PostMapping("/{countryId}")
    public ResponseEntity<Visa> createVisa(@PathVariable Long countryId, @RequestBody Visa visa) {
        Visa savedVisa = visaService.createVisaForCountry(countryId, visa);
        return ResponseEntity.ok(savedVisa);
    }
}
