package com.asia48.asia48_backend.controller;

import com.asia48.asia48_backend.Model.Faq;
import com.asia48.asia48_backend.service.FaqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/faqs")
public class FaqController {

    @Autowired
    private FaqService faqService;


    @GetMapping
    public ResponseEntity<List<Faq>> getAllFaqs() {
        List<Faq> faqs = faqService.getAllFaqs();
        return ResponseEntity.ok(faqs);
    }


    @PostMapping
    public ResponseEntity<Faq> createFaq(@RequestBody Faq faq) {
        Faq newFaq = faqService.createFaq(faq);
        return ResponseEntity.ok(newFaq);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFaq(@PathVariable Long id) {
        faqService.deleteFaq(id);
        return ResponseEntity.noContent().build(); // Standard practice for a successful DELETE
    }
}
