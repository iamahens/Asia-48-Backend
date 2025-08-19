package com.asia48.asia48_backend.service;


import com.asia48.asia48_backend.Model.Question;
import com.asia48.asia48_backend.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;


    public Question submitQuestion(Question question) {
        question.setStatus(Question.QuestionStatus.PENDING);
        question.setSubmittedAt(LocalDateTime.now());
        return questionRepository.save(question);
    }

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }
}