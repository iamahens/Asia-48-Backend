
package com.asia48.asia48_backend.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "universities")
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String country;

    private String city;
    private String ranking;
    private int tuitionFeeMin;
    private int tuitionFeeMax;
    private boolean scholarshipsAvailable;
    private String websiteLink;
    private String applicationDeadline;

    @Column(columnDefinition = "TEXT")
    private String description;

    @OneToMany(mappedBy = "university", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Course> courses;

    // --- Getters and Setters ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getRanking() { return ranking; }
    public void setRanking(String ranking) { this.ranking = ranking; }
    public int getTuitionFeeMin() { return tuitionFeeMin; }
    public void setTuitionFeeMin(int tuitionFeeMin) { this.tuitionFeeMin = tuitionFeeMin; }
    public int getTuitionFeeMax() { return tuitionFeeMax; }
    public void setTuitionFeeMax(int tuitionFeeMax) { this.tuitionFeeMax = tuitionFeeMax; }
    public boolean isScholarshipsAvailable() { return scholarshipsAvailable; }
    public void setScholarshipsAvailable(boolean scholarshipsAvailable) { this.scholarshipsAvailable = scholarshipsAvailable; }
    public String getWebsiteLink() { return websiteLink; }
    public void setWebsiteLink(String websiteLink) { this.websiteLink = websiteLink; }
    public String getApplicationDeadline() { return applicationDeadline; }
    public void setApplicationDeadline(String applicationDeadline) { this.applicationDeadline = applicationDeadline; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public List<Course> getCourses() { return courses; }
    public void setCourses(List<Course> courses) { this.courses = courses; }
}
