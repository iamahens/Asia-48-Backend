
package com.asia48.asia48_backend.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "scholarships")
public class Scholarship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String scholarshipName;

    @Column(nullable = false)
    private String country;

    private String funding; // e.g., "Fully Funded", "Partial Funding"

    @Column(columnDefinition = "TEXT")
    private String eligibility;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String applicationLink;

    // --- Getters and Setters ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getScholarshipName() { return scholarshipName; }
    public void setScholarshipName(String scholarshipName) { this.scholarshipName = scholarshipName; }
    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }
    public String getFunding() { return funding; }
    public void setFunding(String funding) { this.funding = funding; }
    public String getEligibility() { return eligibility; }
    public void setEligibility(String eligibility) { this.eligibility = eligibility; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getApplicationLink() { return applicationLink; }
    public void setApplicationLink(String applicationLink) { this.applicationLink = applicationLink; }
}
