
package com.asia48.asia48_backend.Repository;

import com.asia48.asia48_backend.Model.Scholarship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScholarshipRepository extends JpaRepository<Scholarship, Long> {

    List<Scholarship> findByCountry(String country);
}
