
package com.asia48.asia48_backend.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String courseName;

    private String duration;
    private String level; // e.g., Bachelor, Master, PhD

    @Column(columnDefinition = "TEXT")
    private String eligibility;

    private String fees;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "university_id", nullable = false)
    @JsonBackReference
    private University university;

    // --- Getters and Setters ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }
    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }
    public String getLevel() { return level; }
    public void setLevel(String level) { this.level = level; }
    public String getEligibility() { return eligibility; }
    public void setEligibility(String eligibility) { this.eligibility = eligibility; }
    public String getFees() { return fees; }
    public void setFees(String fees) { this.fees = fees; }
    public University getUniversity() { return university; }
    public void setUniversity(University university) { this.university = university; }
}
