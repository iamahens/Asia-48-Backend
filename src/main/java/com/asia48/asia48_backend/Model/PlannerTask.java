package com.asia48.asia48_backend.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "planner_tasks")
public class PlannerTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // e.g., 12, 9, 6. Represents "X months before intake"
    @Column(nullable = false)
    private int timelineMonths;

    @Column(nullable = false, length = 1000)
    private String taskDescription;

    // General, Country-Specific, etc.
    private String category;

    // e.g., "Japan", "All". "All" means the task applies to every country.
    private String countryFilter;

    // e.g., "Undergraduate", "Postgraduate", "All"
    private String courseLevelFilter;

    // --- Getters and Setters ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public int getTimelineMonths() { return timelineMonths; }
    public void setTimelineMonths(int timelineMonths) { this.timelineMonths = timelineMonths; }
    public String getTaskDescription() { return taskDescription; }
    public void setTaskDescription(String taskDescription) { this.taskDescription = taskDescription; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public String getCountryFilter() { return countryFilter; }
    public void setCountryFilter(String countryFilter) { this.countryFilter = countryFilter; }
    public String getCourseLevelFilter() { return courseLevelFilter; }
    public void setCourseLevelFilter(String courseLevelFilter) { this.courseLevelFilter = courseLevelFilter; }
}
