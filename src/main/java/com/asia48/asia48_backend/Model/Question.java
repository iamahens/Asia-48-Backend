package com.asia48.asia48_backend.Model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Question {

    // An enum to track the status of the question
    public enum QuestionStatus {
        PENDING,
        ANSWERED
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String userEmail;
    private String countryName;
    private String visaType;

    @Column(length = 2000)
    private String questionText;

    @Column(length = 2000)
    private String answerText;

    @Enumerated(EnumType.STRING) // Store the status as a string (e.g., "PENDING")
    private QuestionStatus status;

    private LocalDateTime submittedAt;
    private LocalDateTime answeredAt;

    // --- Getters and Setters ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }
    public String getUserEmail() { return userEmail; }
    public void setUserEmail(String userEmail) { this.userEmail = userEmail; }
    public String getCountryName() { return countryName; }
    public void setCountryName(String countryName) { this.countryName = countryName; }
    public String getVisaType() { return visaType; }
    public void setVisaType(String visaType) { this.visaType = visaType; }
    public String getQuestionText() { return questionText; }
    public void setQuestionText(String questionText) { this.questionText = questionText; }
    public String getAnswerText() { return answerText; }
    public void setAnswerText(String answerText) { this.answerText = answerText; }
    public QuestionStatus getStatus() { return status; }
    public void setStatus(QuestionStatus status) { this.status = status; }
    public LocalDateTime getSubmittedAt() { return submittedAt; }
    public void setSubmittedAt(LocalDateTime submittedAt) { this.submittedAt = submittedAt; }
    public LocalDateTime getAnsweredAt() { return answeredAt; }
    public void setAnsweredAt(LocalDateTime answeredAt) { this.answeredAt = answeredAt; }
}
