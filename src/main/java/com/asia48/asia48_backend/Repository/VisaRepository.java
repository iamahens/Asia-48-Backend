package com.asia48.asia48_backend.Repository;

import com.asia48.asia48_backend.Model.Visa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface VisaRepository extends JpaRepository<Visa, Long> {
    List<Visa> findByCountryNameAndType(String countryName, String type);
    List<Visa> findByCountryName(String countryName);
    List<Visa> findByType(String type);
}
