package com.asia48.asia48_backend.Repository;

import com.asia48.asia48_backend.Model.VisaHighlight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VisaHighlightRepository extends JpaRepository<VisaHighlight, Long> {


    Optional<VisaHighlight> findByCountryNameAndVisaType(String countryName, String visaType);

    @Query("SELECT DISTINCT vh.countryName FROM VisaHighlight vh")
    List<String> findDistinctCountryNames();
}
