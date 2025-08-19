package com.asia48.asia48_backend.controller;


import com.asia48.asia48_backend.Model.VisaHighlight;
import com.asia48.asia48_backend.service.VisaHighlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/highlights")
public class VisaHighlightController {

    @Autowired
    private VisaHighlightService visaHighlightService;


    @GetMapping("/filter")
    public ResponseEntity<VisaHighlight> getHighlight(
            @RequestParam String country,
            @RequestParam String type) {
        return visaHighlightService.getHighlightByFilter(country, type)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


    @GetMapping("/countries")
    public ResponseEntity<List<String>> getFeaturedCountries() {
        return ResponseEntity.ok(visaHighlightService.getFeaturedCountries());
    }
}

