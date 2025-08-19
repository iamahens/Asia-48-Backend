package com.asia48.asia48_backend.service;

import com.asia48.asia48_backend.Model.Faq;
import com.asia48.asia48_backend.Repository.FaqRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaqService {

    @Autowired
    private FaqRepository faqRepository;

    public List<Faq> getAllFaqs() {
        return faqRepository.findAll();
    }


    public Faq createFaq(Faq faq) {
        return faqRepository.save(faq);
    }


    public void deleteFaq(Long id) {
        faqRepository.deleteById(id);
    }
}

