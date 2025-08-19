package com.asia48.asia48_backend.service;

import com.asia48.asia48_backend.Model.Country;
import com.asia48.asia48_backend.Model.Visa;
import com.asia48.asia48_backend.Repository.CountryRepository;
import com.asia48.asia48_backend.Repository.VisaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VisaService {

    @Autowired
    private VisaRepository visaRepository;

    @Autowired
    private CountryRepository countryRepository;

    public List<Visa> getVisasFiltered(String country, String type) {
        if (country != null && type != null) {
            return visaRepository.findByCountryNameAndType(country, type);
        } else if (country != null) {
            return visaRepository.findByCountryName(country);
        } else {
            return visaRepository.findAll();
        }
    }

    public List<Visa> getVisasByType(String type) {
        return visaRepository.findByType(type);
    }

    public Visa createVisaForCountry(Long countryId, Visa visa) {
        Country country = countryRepository.findById(countryId)
                .orElseThrow(() -> new RuntimeException("Country not found with id: " + countryId));
        visa.setCountry(country);
        return visaRepository.save(visa);
    }
}
