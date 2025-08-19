package com.asia48.asia48_backend.Repository;
import com.asia48.asia48_backend.Model.Testimonial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TestimonialRepository extends JpaRepository<Testimonial, Long> {
    // No custom methods are needed for now.
}
