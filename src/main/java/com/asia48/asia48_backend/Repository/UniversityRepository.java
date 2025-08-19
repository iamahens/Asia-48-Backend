// File: src/main/java/com/asia48/asia48_backend/repository/UniversityRepository.java
package com.asia48.asia48_backend.Repository;

import com.asia48.asia48_backend.Model.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository extends JpaRepository<University, Long> {
    }
