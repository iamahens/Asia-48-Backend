package com.asia48.asia48_backend.service;

import com.asia48.asia48_backend.Model.Testimonial;
import com.asia48.asia48_backend.Repository.TestimonialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestimonialService {

    @Autowired
    private TestimonialRepository testimonialRepository;

    public List<Testimonial> getAllTestimonials() {
        return testimonialRepository.findAll();
    }


    public Testimonial createTestimonial(Testimonial testimonial) {
        return testimonialRepository.save(testimonial);
    }

    public void deleteTestimonial(Long id) {
        testimonialRepository.deleteById(id);
    }
}
