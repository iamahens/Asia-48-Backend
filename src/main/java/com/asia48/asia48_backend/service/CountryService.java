package com.asia48.asia48_backend.service;

import com.asia48.asia48_backend.Model.Country;
import com.asia48.asia48_backend.Repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Optional<Country> getCountryByName(String name) {
        return countryRepository.findByName(name);
    }
}