package com.asia48.asia48_backend.controller;

import com.asia48.asia48_backend.Model.Testimonial;
import com.asia48.asia48_backend.service.TestimonialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/testimonials")
public class TestimonialController {

    @Autowired
    private TestimonialService testimonialService;


    @GetMapping
    public ResponseEntity<List<Testimonial>> getAllTestimonials() {
        List<Testimonial> testimonials = testimonialService.getAllTestimonials();
        return ResponseEntity.ok(testimonials);
    }


    @PostMapping
    public ResponseEntity<Testimonial> createTestimonial(@RequestBody Testimonial testimonial) {
        Testimonial newTestimonial = testimonialService.createTestimonial(testimonial);
        return ResponseEntity.ok(newTestimonial);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTestimonial(@PathVariable Long id) {
        testimonialService.deleteTestimonial(id);
        return ResponseEntity.noContent().build();
    }
}
