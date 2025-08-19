package com.asia48.asia48_backend.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "visa_highlights")
public class VisaHighlight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String countryName;
    private String visaType; // Education, Immigration, Travel, Business
    private String visaValidity;
    private String stayDuration;
    private String processingTime;
    private String fee;

    @Column(length = 1000)
    private String eligibilityBrief;

    @Column(length = 1000)
    private String servicesOffered;

    @Column(length = 2000)
    private String requiredDocs;

    // Quick Facts
    private String flagUrl;
    private String currency;
    private String language;

    // --- Getters and Setters ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCountryName() { return countryName; }
    public void setCountryName(String countryName) { this.countryName = countryName; }
    public String getVisaType() { return visaType; }
    public void setVisaType(String visaType) { this.visaType = visaType; }
    public String getVisaValidity() { return visaValidity; }
    public void setVisaValidity(String visaValidity) { this.visaValidity = visaValidity; }
    public String getStayDuration() { return stayDuration; }
    public void setStayDuration(String stayDuration) { this.stayDuration = stayDuration; }
    public String getProcessingTime() { return processingTime; }
    public void setProcessingTime(String processingTime) { this.processingTime = processingTime; }
    public String getFee() { return fee; }
    public void setFee(String fee) { this.fee = fee; }
    public String getEligibilityBrief() { return eligibilityBrief; }
    public void setEligibilityBrief(String eligibilityBrief) { this.eligibilityBrief = eligibilityBrief; }
    public String getServicesOffered() { return servicesOffered; }
    public void setServicesOffered(String servicesOffered) { this.servicesOffered = servicesOffered; }
    public String getRequiredDocs() { return requiredDocs; }
    public void setRequiredDocs(String requiredDocs) { this.requiredDocs = requiredDocs; }
    public String getFlagUrl() { return flagUrl; }
    public void setFlagUrl(String flagUrl) { this.flagUrl = flagUrl; }
    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }
    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }
}
