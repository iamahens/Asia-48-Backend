package com.asia48.asia48_backend.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Visa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // --- Overview Fields ---
    private String type; // Education, Immigration, Travel, Business
    private String applicationFee;
    private String processingTime;
    private String stayDuration;
    private String visaValidity;
    @Column(length = 1000)
    private String eligibilityBrief;

    // --- Elaborated Details for Individual Pages ---
    @Column(columnDefinition = "TEXT")
    private String detailedDescription;

    @Column(columnDefinition = "TEXT")
    private String applicationProcess;

    @Column(columnDefinition = "TEXT")
    private String documentChecklist;

    @Column(columnDefinition = "TEXT")
    private String financialRequirements;

    @Column(columnDefinition = "TEXT")
    private String commonPitfalls;

    @Column(columnDefinition = "TEXT")
    private String itinerarySuggestion;

    @Column(columnDefinition = "TEXT")
    private String cuisineSuggestion;

    // --- NEW FIELD ---
    @Column(length = 1000)
    private String servicesOffered;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id", nullable = false)
    @JsonBackReference
    private Country country;

    // --- Getters and Setters for all fields ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getApplicationFee() { return applicationFee; }
    public void setApplicationFee(String applicationFee) { this.applicationFee = applicationFee; }
    public String getProcessingTime() { return processingTime; }
    public void setProcessingTime(String processingTime) { this.processingTime = processingTime; }
    public String getStayDuration() { return stayDuration; }
    public void setStayDuration(String stayDuration) { this.stayDuration = stayDuration; }
    public String getVisaValidity() { return visaValidity; }
    public void setVisaValidity(String visaValidity) { this.visaValidity = visaValidity; }
    public String getEligibilityBrief() { return eligibilityBrief; }
    public void setEligibilityBrief(String eligibilityBrief) { this.eligibilityBrief = eligibilityBrief; }
    public String getDetailedDescription() { return detailedDescription; }
    public void setDetailedDescription(String detailedDescription) { this.detailedDescription = detailedDescription; }
    public String getApplicationProcess() { return applicationProcess; }
    public void setApplicationProcess(String applicationProcess) { this.applicationProcess = applicationProcess; }
    public String getDocumentChecklist() { return documentChecklist; }
    public void setDocumentChecklist(String documentChecklist) { this.documentChecklist = documentChecklist; }
    public String getFinancialRequirements() { return financialRequirements; }
    public void setFinancialRequirements(String financialRequirements) { this.financialRequirements = financialRequirements; }
    public String getCommonPitfalls() { return commonPitfalls; }
    public void setCommonPitfalls(String commonPitfalls) { this.commonPitfalls = commonPitfalls; }
    public String getItinerarySuggestion() { return itinerarySuggestion; }
    public void setItinerarySuggestion(String itinerarySuggestion) { this.itinerarySuggestion = itinerarySuggestion; }
    public String getCuisineSuggestion() { return cuisineSuggestion; }
    public void setCuisineSuggestion(String cuisineSuggestion) { this.cuisineSuggestion = cuisineSuggestion; }
    public String getServicesOffered() { return servicesOffered; }
    public void setServicesOffered(String servicesOffered) { this.servicesOffered = servicesOffered; }
    public Country getCountry() { return country; }
    public void setCountry(Country country) { this.country = country; }
}
