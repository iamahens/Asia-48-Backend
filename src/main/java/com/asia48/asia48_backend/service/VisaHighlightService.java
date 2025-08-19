package com.asia48.asia48_backend.service;



import com.asia48.asia48_backend.Model.VisaHighlight;
import com.asia48.asia48_backend.Repository.VisaHighlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VisaHighlightService {

    @Autowired
    private VisaHighlightRepository visaHighlightRepository;

    public Optional<VisaHighlight> getHighlightByFilter(String country, String type) {
        return visaHighlightRepository.findByCountryNameAndVisaType(country, type);
    }

    public List<String> getFeaturedCountries() {
        return visaHighlightRepository.findDistinctCountryNames();
    }
}
