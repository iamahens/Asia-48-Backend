package com.asia48.asia48_backend.controller;

import com.asia48.asia48_backend.Model.Country;
import com.asia48.asia48_backend.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public ResponseEntity<List<Country>> getAllCountries() {
        return ResponseEntity.ok(countryService.getAllCountries());
    }

    @GetMapping("/{name}")
    public ResponseEntity<Country> getCountryByName(@PathVariable String name) {
        return countryService.getCountryByName(name)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}